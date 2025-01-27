package Program_53 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[C](a: C, b: T_B[T_A, CC_A], c: CC_A) extends T_B[T_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(_, _),CC_B(_, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 4 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A)
//             (CC_B (CC_A (Tuple Wildcard Wildcard) Wildcard T_A)
//                   (CC_A Wildcard Wildcard T_A)
//                   T_A))
//      Wildcard
//      T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A (Tuple (CC_C Wildcard Wildcard T_A) (CC_A Wildcard T_A)) T_A)
// Mutation information: 
// Deleted Pattern CC_A((CC_C(_, _),CC_C(_, _))) at position 4