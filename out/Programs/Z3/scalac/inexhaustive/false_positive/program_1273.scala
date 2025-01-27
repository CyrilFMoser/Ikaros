package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_B (CC_A T_A Wildcard Wildcard T_A) T_A)
// This is not matched: (CC_F (CC_C T_A T_A)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B Boolean (CC_C T_A T_A)))