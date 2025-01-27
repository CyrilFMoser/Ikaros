package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Byte,Char), b: T_A[D, D]) extends T_A[(Int,Char), D]

val v_a: T_A[(Int,Char), Char] = null
val v_b: Int = v_a match{
  case CC_B((_,'x'), _) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A()
//  CC_B(_)
// }
//