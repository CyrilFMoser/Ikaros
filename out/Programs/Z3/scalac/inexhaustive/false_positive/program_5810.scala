package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_E(a: T_A) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants