package Program_31 

package Program_5 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A (CC_B T_A Wildcard T_A) T_A)
// This is not matched: (CC_A (T_A Byte) Wildcard (T_A (T_A Byte)))