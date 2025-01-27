package Program_63 

package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,Char), b: T_A[T_B, T_B], c: Char) extends T_A[T_B, Char]
case class CC_B(a: CC_A, b: Char, c: T_A[T_B, Byte]) extends T_A[T_B, Char]
case class CC_C[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C T_B T_B)
// This is not matched: (CC_B Char Wildcard Wildcard (CC_C Char Wildcard (T_A Char)) (T_A Char))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//