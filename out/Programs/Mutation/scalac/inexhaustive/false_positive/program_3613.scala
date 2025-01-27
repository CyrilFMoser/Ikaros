package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_C(a: T_A[CC_A], b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_B()
//  CC_C(_, _, _)
// }
//