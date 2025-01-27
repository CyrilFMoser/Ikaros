package Program_7 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)