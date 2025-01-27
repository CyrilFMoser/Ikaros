package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: Char, b: CC_A, c: Byte) extends T_A
case class CC_D(a: CC_A, b: Boolean) extends T_B[T_A]
case class CC_E[B](a: B, b: B, c: Byte) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_D(CC_A(CC_E(_, _, _), _, _), _) => 1 
  case CC_D(CC_A(CC_D(_, _), _, _), _) => 1 
}
}
// This is not matched: (CC_E T_A Wildcard Wildcard Wildcard (T_B T_A))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_D(_, _)
//  CC_E(_, _, _)
// }
//
// This is not matched: (CC_B Boolean (T_A Boolean))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//