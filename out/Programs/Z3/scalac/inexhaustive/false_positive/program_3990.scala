package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: (Boolean,T_A), b: T_A, c: Char) extends T_A
case class CC_B(a: T_B, b: T_A) extends T_B
case class CC_C(a: CC_A[CC_B], b: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, CC_A(_, _, _), 'x') => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)