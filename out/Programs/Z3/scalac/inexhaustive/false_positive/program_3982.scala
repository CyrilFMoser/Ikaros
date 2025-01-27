package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_C], b: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_C Wildcard Wildcard T_B) Wildcard T_B)