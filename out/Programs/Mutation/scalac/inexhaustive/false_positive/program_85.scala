package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[T_A[Int, Boolean], C]

val v_a: T_A[T_A[Int, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _)
// }
//