package Program_28 

object Test {
sealed trait T_B
case class CC_B() extends T_B
case class CC_C(a: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: CC_B(CC_A())