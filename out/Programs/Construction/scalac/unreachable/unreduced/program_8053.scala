package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: F, b: F, c: Byte) extends T_B[F, T_A[T_A[Char]]]
case class CC_D[G](a: CC_A[G], b: CC_C[G], c: CC_B[G]) extends T_B[G, T_A[T_A[Char]]]

val v_a: T_B[Int, T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, 0) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_A(_), _, CC_B()) => 2 
}
}