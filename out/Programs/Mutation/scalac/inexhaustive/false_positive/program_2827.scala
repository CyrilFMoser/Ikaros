package Program_29 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: C, c: (T_A,Boolean)) extends T_A
case class CC_B(a: Int, b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[D, E](a: CC_C) extends T_B[D, E]
case class CC_E[F](a: F, b: CC_A[F]) extends T_B[T_B[F, F], F]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(_), CC_B(_, CC_D(_), _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (CC_C Wildcard T_A) T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_D(_)
// }
//
// This is not matched: (CC_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
//  CC_B(_, _, _)
// }
//