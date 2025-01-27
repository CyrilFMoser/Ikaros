package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: C) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard T_A)