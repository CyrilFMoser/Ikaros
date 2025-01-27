package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B[A]() extends T_B
case class CC_C(a: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: (CC_B T_A T_B)
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)