package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[(T_A[Byte, Int],T_B[Boolean, Char]), E]
case class CC_B[F](a: T_A[F, F], b: Boolean) extends T_A[(T_A[Byte, Int],T_B[Boolean, Char]), F]

val v_a: T_A[(T_A[Byte, Int],T_B[Boolean, Char]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _) => 2 
}
}