package Program_31 

package Program_9 

object Test {
sealed trait T_A
case class CC_A[A](a: Char, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C (CC_A Wildcard (CC_B Wildcard T_A) T_A) T_A)