package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_C Char (T_A Char))
//      (CC_B Char Wildcard Wildcard (T_A Char))
//      (CC_C Char (T_A Char))
//      (T_A Char))
// Mutation information: 
// Expanded _ at position 13 into: 
// {
//  CC_A(_, _, _)
// }
//