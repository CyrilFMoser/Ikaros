package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_A[E]) extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_A())) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//