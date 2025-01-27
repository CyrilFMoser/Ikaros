package Program_14 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B[A](a: CC_A, b: A) extends T_B
case class CC_C(a: T_A, b: T_A, c: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _, _) => 2 
}
}
// This is not matched: (CC_B T_A (CC_A T_A) Wildcard T_B)
// This is not matched: (CC_C Wildcard T_A)