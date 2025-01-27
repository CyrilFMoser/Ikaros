package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: T_A[CC_A]) extends T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]]
case class CC_C[D, E](a: T_A[D], b: Byte) extends T_B[D, E]
case class CC_D[F](a: CC_C[F, F]) extends T_B[Char, F]
case class CC_E[G](a: T_A[G]) extends T_B[Char, G]

val v_a: T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
}
}