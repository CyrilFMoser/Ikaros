package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int) extends T_A[C, D]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Byte (Tuple Char Boolean) (T_B Byte (Tuple Char Boolean)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_D()
// }
//