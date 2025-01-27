package Program_12 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_E Int Wildcard Wildcard Wildcard (T_B (T_A Boolean) Int))