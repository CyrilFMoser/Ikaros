package Program_12 

package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: Boolean) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B (CC_B (CC_C Wildcard Wildcard T_B) Wildcard Wildcard T_B)
//      Wildcard
//      Wildcard
//      T_B)