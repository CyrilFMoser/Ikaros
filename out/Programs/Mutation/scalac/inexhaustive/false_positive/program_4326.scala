package Program_30 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: Byte) extends T_A[D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B()
// }
//