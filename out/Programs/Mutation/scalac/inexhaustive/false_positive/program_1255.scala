package Program_57 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Boolean, c: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: T_A, b: CC_A) extends T_A
case class CC_C[D, E](a: D, b: CC_B[E]) extends T_B[D, (CC_A,T_A)]
case class CC_D[F](a: T_A, b: Boolean) extends T_B[F, (CC_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A T_A) Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_, _, _), _) at position 1
// This is not matched: (CC_B T_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//