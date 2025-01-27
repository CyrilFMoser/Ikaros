package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[D, T_B[T_A[(Boolean,Char), Int]]]
case class CC_B() extends T_A[CC_A[T_A[Char, Int]], T_B[T_A[(Boolean,Char), Int]]]
case class CC_C[E](a: T_A[E, E], b: Char) extends T_B[E]
case class CC_D[F](a: T_B[(CC_B,CC_B)], b: Byte) extends T_B[F]
case class CC_E[G](a: Char, b: CC_A[G]) extends T_B[G]

val v_a: T_B[T_A[CC_A[T_A[Char, Int]], T_B[T_A[(Boolean,Char), Int]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), _) => 1 
  case CC_D(CC_D(_, _), _) => 2 
  case CC_D(CC_E(_, _), _) => 3 
  case CC_E(_, _) => 4 
}
}