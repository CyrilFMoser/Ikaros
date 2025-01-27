package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
// }
//