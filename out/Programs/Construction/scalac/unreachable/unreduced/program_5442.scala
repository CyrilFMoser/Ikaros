package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[Char, D], c: Boolean) extends T_A[(T_B[Boolean],T_B[Char]), D]
case class CC_B[E](a: CC_A[T_B[E]]) extends T_A[(T_B[Boolean],T_B[Char]), E]
case class CC_C[F](a: Char, b: F, c: Byte) extends T_A[(T_B[Boolean],T_B[Char]), F]
case class CC_D[G](a: CC_C[G], b: CC_A[CC_A[G]]) extends T_B[G]

val v_a: T_A[(T_B[Boolean],T_B[Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}