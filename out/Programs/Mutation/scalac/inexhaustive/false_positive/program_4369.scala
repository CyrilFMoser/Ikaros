package Program_20 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E]() extends T_A[D, C]
case class CC_B(a: Byte, b: CC_A[T_B, T_B, Boolean], c: T_A[T_B, (Boolean,Boolean)]) extends T_B
case class CC_C[F](a: (T_B,CC_B), b: CC_B, c: T_A[F, F]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C((CC_C(_, _, _),CC_B(_, _, _)), CC_B(_, _, _), _) => 1 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 2 
  case CC_C((CC_C(_, _, _),CC_B(_, _, _)), _, _) => 3 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, _, _), CC_A()) => 4 
  case CC_C(_, CC_B(_, _, _), CC_A()) => 5 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, _, _), _) => 6 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _, CC_A()) => 7 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 5 into: 
// {
//  CC_A()
// }
//
// This is not matched: (CC_D Wildcard Wildcard (CC_E T_B) T_B)
// Mutation information: 
// Deleted Pattern CC_E() at position 0