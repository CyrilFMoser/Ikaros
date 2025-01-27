package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Int (CC_A Int (T_A Int)) Byte Wildcard (T_A Int))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//