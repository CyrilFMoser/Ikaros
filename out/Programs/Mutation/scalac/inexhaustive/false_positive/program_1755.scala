package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E](a: E, b: T_A[Int, E]) extends T_A[E, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_D (CC_B T_A T_A) (T_B (T_B (CC_B T_A T_A) (CC_B T_A T_A)) (CC_B T_A T_A)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_F(_)
// }
//