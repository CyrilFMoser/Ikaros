package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[G](a: G) extends T_A[G, T_B[G, G]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Int
//      Boolean
//      (CC_A Int Int (T_A Int Int))
//      (CC_B Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//      Wildcard
//      (T_A Int Boolean))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//