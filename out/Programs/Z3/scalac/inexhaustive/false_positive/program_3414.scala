package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_D() extends T_B
case class CC_E(a: Boolean, b: T_A[CC_D]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants