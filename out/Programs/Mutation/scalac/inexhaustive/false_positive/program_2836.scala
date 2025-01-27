package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[Byte]) extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_A(), _), _) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//