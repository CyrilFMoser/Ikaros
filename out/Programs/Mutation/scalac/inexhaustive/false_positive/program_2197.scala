package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_D (CC_B Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A) (CC_A T_A)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//