package Program_30 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: (Char,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B (CC_B Wildcard T_B) T_B)