package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int) extends T_A[T_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
// }
//