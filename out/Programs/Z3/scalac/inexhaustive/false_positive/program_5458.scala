package Program_12 

package Program_11 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: (Boolean,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B (T_A Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A Int Boolean Boolean Boolean)))