package Program_1 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
}
}
// This is not matched: CC_A()