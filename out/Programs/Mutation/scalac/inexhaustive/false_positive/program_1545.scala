package Program_60 

package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: (Char,Byte), c: T_A[E, E]) extends T_A[T_B[Byte, Byte], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[Byte, Byte], F]
case class CC_C[H, G, I](a: H, b: T_A[Char, I], c: T_B[H, H]) extends T_B[G, H]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//