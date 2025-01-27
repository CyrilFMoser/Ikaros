package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_A, c: C) extends T_A
case class CC_B(a: CC_A[T_A], b: CC_A[T_A]) extends T_A
case class CC_C[D, E]() extends T_B[D, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, _, _), _) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants