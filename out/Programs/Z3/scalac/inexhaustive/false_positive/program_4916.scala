package Program_12 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Char, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 'x', _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: (CC_A (CC_A T_A T_A T_A T_A T_A) Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_E T_A
//      Wildcard
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (T_B (Tuple (CC_B T_A T_A T_A) T_A) T_A))