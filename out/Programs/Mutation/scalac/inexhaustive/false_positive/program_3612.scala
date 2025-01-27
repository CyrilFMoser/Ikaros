package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_C(_, _), _) => 1 
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