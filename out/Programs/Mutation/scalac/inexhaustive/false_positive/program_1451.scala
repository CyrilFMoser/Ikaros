package Program_41 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (Boolean,T_B), b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D, E]() extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(_, CC_B(), CC_C()) => 2 
  case CC_A(_, _, CC_C()) => 2 
  case CC_A(_, _, CC_B()) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_C(), CC_B()) => 5 
  case CC_A(_, CC_B(), CC_B()) => 6 
  case CC_A(_, CC_C(), _) => 7 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 8 
}
}
// This is not matched: (CC_C Char T_B (T_A Char))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
//  CC_C()
// }
//
// This is not matched: (CC_C Char T_B (T_A Char))
// Mutation information: 
// Expanded _ at position 6 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
// }
//