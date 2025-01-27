package Program_31 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: Int) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C, D, E]() extends T_B[C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _, _) => 0 
  case CC_A(_, CC_A(_, _, _), 12) => 1 
  case CC_A(_, CC_B(_), 12) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_A (CC_C T_A T_A T_A (T_B T_A T_A)) Wildcard Wildcard T_A)
// This is not matched: (CC_B (CC_B Wildcard Wildcard Wildcard T_B) Wildcard Wildcard T_B)