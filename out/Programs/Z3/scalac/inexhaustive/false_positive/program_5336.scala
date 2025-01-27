package Program_13 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: T_A, c: T_B[B]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E Boolean Wildcard Wildcard (T_B Boolean Char))