package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard (CC_C Byte T_B) T_A)