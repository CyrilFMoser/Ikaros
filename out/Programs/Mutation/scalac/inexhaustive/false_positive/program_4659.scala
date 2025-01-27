package Program_17 

object Test {
sealed trait T_B[C]
case class CC_B(a: Int) extends T_B[(Boolean,Byte)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//