package Program_63 

package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C]) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: CC_A[T_A]) extends T_A
case class CC_C[D, E](a: CC_A[D]) extends T_B[E, D]
case class CC_D[F](a: T_B[F, F], b: CC_A[F], c: CC_C[F, F]) extends T_B[CC_A[F], F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_C(_), CC_A(CC_C(_))) => 1 
  case CC_B(CC_C(_), _) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_C(_)
// }
//
// This is not matched: (CC_C T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_D(_), CC_A(_, _), CC_D(_)) at position 1