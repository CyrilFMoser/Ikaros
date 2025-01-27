package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int))
// This is not matched: (CC_D (CC_B T_A T_A) (T_B (T_B (CC_B T_A T_A) (CC_B T_A T_A)) (CC_B T_A T_A)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_F(_)
// }
//