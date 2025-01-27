package Program_21 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[C, D]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Int Boolean (T_A Boolean Int))
// This is not matched: (CC_A Char
//      (CC_C Char (T_A Char))
//      (CC_B Char Wildcard Wildcard (T_A Char))
//      (CC_C Char (T_A Char))
//      (T_A Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//