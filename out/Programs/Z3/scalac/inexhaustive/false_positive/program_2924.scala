package Program_9 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard (T_A (T_A Boolean)))