package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_A) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)