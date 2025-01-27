package Program_30 

object Test {
sealed trait T_B[B]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_B[D]) extends T_B[D]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
}
}
// This is not matched: (CC_D Int (CC_C Int (T_B Int)) Wildcard Wildcard (T_B Int))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C()
//  CC_D(_, _, _)
// }
//