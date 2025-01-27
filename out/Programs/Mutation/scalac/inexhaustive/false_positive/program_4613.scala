package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: (CC_A,T_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,CC_D(_))) => 0 
}
}
// This is not matched: (CC_D (Tuple (CC_A Wildcard Wildcard Wildcard (T_A Int))
//             (CC_E (CC_B (T_A Int)) Char T_B))
//      Wildcard
//      Wildcard
//      T_B)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//