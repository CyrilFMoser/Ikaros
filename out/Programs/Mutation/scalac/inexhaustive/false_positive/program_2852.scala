package Program_24 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[T_A[Boolean]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A (CC_D T_B T_B (T_A T_B))
//      T_B
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_D T_B T_B (T_A T_B))))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_D(_, _)
//  CC_E(_, _)
//  CC_F(_, _)
// }
//