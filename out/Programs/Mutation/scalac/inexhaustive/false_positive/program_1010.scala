package Program_63 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[T_B[Int]]
case class CC_B(a: (Boolean,Int), b: T_B[Char], c: T_B[Char]) extends T_A[T_B[Int]]
case class CC_C[D](a: (CC_B,CC_B), b: D, c: CC_A[D]) extends T_B[D]
case class CC_D[E](a: E, b: Char) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_E()) => 0 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      (CC_C Char Wildcard Char Wildcard (T_B Char))
//      (T_A (T_B Int)))
// This is not matched: (CC_B Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B(_, _)
//  CC_C(_, _, _)
// }
//