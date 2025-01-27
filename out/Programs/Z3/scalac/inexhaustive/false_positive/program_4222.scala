package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants