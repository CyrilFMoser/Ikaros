package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Int, c: T_A[Boolean]) extends T_A[T_A[Byte]]
case class CC_B[B](a: B, b: B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_F Char Wildcard Wildcard (T_B Char (CC_B Char Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
//  CC_B(_)
//  CC_C(_)
// }
//