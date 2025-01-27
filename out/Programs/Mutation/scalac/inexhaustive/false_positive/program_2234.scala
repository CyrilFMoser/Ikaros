package Program_30 

package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte, b: B) extends T_A[B]
case class CC_B[C, D](a: Byte, b: CC_A[D]) extends T_A[C]
case class CC_C[E](a: E, b: E) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, 'x') => 2 
  case CC_C(_, _) => 3 
  case CC_B(_, CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_B Char Boolean Byte Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_A(0, _) at position 1
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 2 to a constant expression:
// {
//  'x'
// }
//