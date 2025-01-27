package Program_29 

package Program_7 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: CC_B, b: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), CC_B()) => 2 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants