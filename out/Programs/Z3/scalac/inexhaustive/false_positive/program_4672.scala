package Program_13 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B (CC_A (Tuple Int Boolean) T_A) T_A)