package Program_30 

package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (Char,Char), b: T_A[E, E]) extends T_A[F, E]
case class CC_B[H, G, I]() extends T_A[G, H]
case class CC_C[J](a: T_A[Boolean, Boolean]) extends T_B[J, T_B[Char, Byte]]

val v_a: T_B[Char, T_B[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_C(CC_A(_, CC_B())) => 1 
  case CC_C(CC_A(_, CC_A(_, _))) => 1 
}
}
// This is not matched: (CC_C Char
//      (CC_B Boolean Boolean Boolean (T_A Boolean Boolean))
//      (T_B Char (T_B Char Byte)))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B()
// }
//
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_, _), _, 0) at position 3