package Program_23 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: (CC_A,CC_A), c: A) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
  case CC_A(_) => 1 
  case CC_B(CC_A(CC_B(_, _, _)), _, _) => 2 
  case CC_B(CC_A(CC_A(_)), _, _) => 2 
  case CC_B(_, (CC_A(_),CC_A(_)), _) => 3 
  case CC_C() => 4 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_)
//  CC_B(_, _, _)
// }
//
// This is not matched: (CC_D (Tuple Boolean (Tuple Byte Boolean))
//      (CC_C (T_B (Tuple Boolean (Tuple Byte Boolean))))
//      (T_B (Tuple Boolean (Tuple Byte Boolean))))
// Mutation information: 
// Deleted Pattern CC_C() at position 0