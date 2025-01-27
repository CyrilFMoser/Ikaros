package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Wildcard Boolean Boolean (T_A Boolean))
//      Boolean
//      Boolean
//      (T_A Boolean))