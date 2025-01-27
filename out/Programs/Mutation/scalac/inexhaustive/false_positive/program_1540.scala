package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: E) extends T_A[E, (Boolean,Char)]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
// }
//