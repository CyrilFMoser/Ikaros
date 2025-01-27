package Program_49 

package Program_28 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_A), b: (Byte,T_B), c: T_B) extends T_A
case class CC_B() extends T_B
case class CC_C[A](a: CC_A, b: (T_A,Char), c: Int) extends T_B
case class CC_D(a: Int, b: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), _, _) => 1 
  case CC_C(_, (CC_A(_, _, _),'x'), _) => 2 
  case CC_C(_, (CC_A(_, _, _),'x'), 12) => 3 
  case CC_C(_, (CC_A(_, _, _),_), 12) => 4 
  case CC_C(CC_A(_, _, _), (CC_A(_, _, _),'x'), _) => 5 
  case CC_D(_, _) => 6 
  case CC_D(12, CC_A(_, _, _)) => 7 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 5 to a constant expression:
// {
//  'x'
// }
//
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Deleted Pattern CC_D(12, CC_A(_, _, _)) at position 7