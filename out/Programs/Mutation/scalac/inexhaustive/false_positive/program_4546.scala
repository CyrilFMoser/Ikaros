package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: D) extends T_A[D, T_A[D, D]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
//  CC_B(_, _)
// }
//