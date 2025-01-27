package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Int) extends T_A[Boolean, D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//