package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B())) => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//