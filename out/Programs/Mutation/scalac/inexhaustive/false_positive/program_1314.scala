package Program_57 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: Byte) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: (CC_A,CC_B), b: (CC_C,CC_C), c: T_A) extends T_B[B]
case class CC_E[C, D](a: D, b: CC_C, c: T_B[C]) extends T_B[C]
case class CC_F[E](a: T_B[E], b: Int, c: CC_C) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, _)) => 0 
  case CC_D(_, (CC_C(),CC_C()), _) => 1 
  case CC_D((CC_A(_, _),CC_B(_)), _, CC_B(_)) => 2 
  case CC_D(_, _, CC_C()) => 3 
  case CC_D((CC_A(_, _),CC_B(_)), _, _) => 4 
  case CC_E(_, _, _) => 5 
  case CC_E(_, CC_C(), CC_D(_, _, CC_B(_))) => 6 
  case CC_E(_, CC_C(), CC_D(_, _, CC_A(_, _))) => 6 
  case CC_E(_, _, CC_D(_, _, _)) => 7 
  case CC_E(_, CC_C(), CC_E(_, _, _)) => 8 
  case CC_E(_, _, CC_E(_, _, _)) => 9 
  case CC_F(CC_F(_, _, _), _, CC_C()) => 10 
  case CC_F(CC_D(_, _, _), 12, _) => 11 
  case CC_F(CC_E(_, _, _), 12, CC_C()) => 12 
  case CC_F(CC_F(_, _, _), _, _) => 13 
  case CC_F(CC_D(_, _, _), _, CC_C()) => 14 
  case CC_F(_, 12, CC_C()) => 15 
  case CC_F(CC_E(_, _, _), _, CC_C()) => 16 
}
}
// This is not matched: (CC_E (CC_B T_A T_A) Boolean Boolean Wildcard Wildcard (T_B (CC_B T_A T_A)))
// Mutation information: 
// Expanded _ at position 6 into: 
// {
//  CC_A(_, _)
//  CC_B(_)
// }
//
// This is not matched: (CC_E (CC_B T_A T_A) Boolean Boolean Wildcard Wildcard (T_B (CC_B T_A T_A)))
// Mutation information: 
// Deleted Pattern CC_F(CC_E(_, _, _), 12, CC_C()) at position 12