package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D) extends T_A[D, C]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C Byte (T_A Byte))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_, _)
// }
//