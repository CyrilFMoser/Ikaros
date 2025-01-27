package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_B (CC_B Wildcard (CC_A Wildcard Wildcard T_A) T_A) Wildcard T_A)