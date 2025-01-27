package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A
case class CC_B[A](a: A, b: CC_A) extends T_A
case class CC_C(a: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B T_A) T_A)