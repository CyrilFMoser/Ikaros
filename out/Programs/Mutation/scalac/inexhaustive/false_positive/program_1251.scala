package Program_61 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[D]() extends T_B[D, (CC_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B T_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//