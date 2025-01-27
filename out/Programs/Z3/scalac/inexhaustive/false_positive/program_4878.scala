package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[F, E]() extends T_A[E, F]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_D, T_B]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants