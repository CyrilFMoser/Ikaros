package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, (Char,Boolean)]) extends T_A[D, C]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
}
}