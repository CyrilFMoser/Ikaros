package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C[E](a: E) extends T_B[E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_D Byte (Tuple Char Boolean) (T_B Byte (Tuple Char Boolean)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_D()
// }
//