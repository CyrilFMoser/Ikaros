package Program_1 

object Test {
sealed trait T_B[B]
case class CC_D[D](a: D) extends T_B[D]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
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