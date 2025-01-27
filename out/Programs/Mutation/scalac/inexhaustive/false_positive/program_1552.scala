package Program_57 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: (Char,Byte), c: T_A[E, E]) extends T_A[T_B[Byte, Byte], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[Byte, Byte], F]
case class CC_C[H, G, I](a: H, b: T_A[Char, I], c: T_B[H, H]) extends T_B[G, H]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: (CC_C Int Char Boolean Wildcard Wildcard Wildcard (T_B Char Int))
// This is not matched: (CC_C (CC_A Wildcard Wildcard Wildcard T_A)
//      (Tuple Wildcard (CC_B T_A T_A))
//      Wildcard
//      (T_B (Tuple T_A T_A)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//