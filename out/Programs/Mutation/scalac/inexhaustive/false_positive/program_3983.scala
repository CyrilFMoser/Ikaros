package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_C[D]() extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_C Char (T_A Char))
//      (CC_B Char Wildcard Wildcard (T_A Char))
//      (CC_C Char (T_A Char))
//      (T_A Char))
// Mutation information: 
// Expanded _ at position 21 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//