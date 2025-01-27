package Program_62 

package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: T_B[E, E]) extends T_A[T_A[Int, Byte], E]
case class CC_B[F](a: F, b: F, c: CC_A[F]) extends T_A[T_A[Int, Byte], F]
case class CC_C(a: (Byte,Boolean)) extends T_A[T_A[Int, Byte], Boolean]
case class CC_D[G, H, I](a: CC_A[H], b: CC_C) extends T_B[G, H]
case class CC_E[J](a: J, b: T_A[J, J], c: CC_D[CC_C, J, J]) extends T_B[J, T_B[J, J]]

val v_a: CC_A[T_A[T_A[Int, Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _, _), CC_D(_, _)) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Int Byte) Boolean)
//      Wildcard
//      (CC_C Wildcard (T_A (T_A Int Byte) Boolean))
//      Wildcard
//      (T_A (T_A Int Byte) (T_A (T_A Int Byte) Boolean)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_D(_, _)
// }
//
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A)
//             (CC_B (CC_A (Tuple Wildcard Wildcard) Wildcard T_A)
//                   (CC_A Wildcard Wildcard T_A)
//                   T_A))
//      Wildcard
//      T_A)
// Mutation information: 
// Deleted Pattern CC_A((CC_B(_, _),CC_B(_, _)), _) at position 0