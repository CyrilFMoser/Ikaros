package Program_12 

object Test {
sealed trait T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants