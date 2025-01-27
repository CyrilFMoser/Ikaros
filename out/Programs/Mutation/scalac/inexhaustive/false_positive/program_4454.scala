package Program_20 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: T_A, b: CC_A, c: C) extends T_A
case class CC_C[E, D](a: CC_A, b: T_B[D, D], c: Boolean) extends T_B[D, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(_, _, _), _, _) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _), _) => 5 
  case CC_A(_, CC_B(_, _, _), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_B(_, _, _)) => 7 
  case CC_A(_, _, CC_B(_, _, _)) => 8 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 9 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_B(_, _, _)) => 10 
  case CC_A(CC_C(_, _, _), _, CC_B(_, _, _)) => 11 
  case CC_A(_, _, _) => 12 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 13 
  case CC_A(_, _, CC_A(_, _, _)) => 14 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 15 
  case CC_A(_, CC_B(_, _, _), _) => 16 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), _) => 17 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 7 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 9 into: 
// {
//  CC_A(_, _, _)
// }
//