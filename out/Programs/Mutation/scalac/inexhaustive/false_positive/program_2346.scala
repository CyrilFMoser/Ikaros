package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_C[G, H](a: T_A[G, H]) extends T_A[G, H]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_A())) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 0 to a constant expression:
// {
//  'x'
// }
//