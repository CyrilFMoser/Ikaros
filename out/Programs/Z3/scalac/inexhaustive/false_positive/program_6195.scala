package Program_11 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: T_B) extends T_A

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Int (CC_A T_A Wildcard Wildcard T_A) Wildcard T_A)
// This is not matched: (CC_B (Tuple Wildcard (CC_C Wildcard T_A)) Wildcard Wildcard T_A)