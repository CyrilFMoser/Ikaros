package Program_61 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Int]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Char
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Boolean Char))
//      (T_A Boolean Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
// }
//