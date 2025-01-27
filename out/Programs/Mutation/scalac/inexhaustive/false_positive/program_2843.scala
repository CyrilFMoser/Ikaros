package Program_27 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Boolean], b: T_A[C, C]) extends T_A[C, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte Boolean))
// This is not matched: (CC_B (CC_A Char Char Char Wildcard (T_A Char)) T_B)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_B(_)
// }
//