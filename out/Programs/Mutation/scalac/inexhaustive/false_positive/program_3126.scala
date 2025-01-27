package Program_20 

package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B[B, C](a: CC_A, b: CC_A) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_B(_, _))) => 0 
  case CC_B(_, CC_A(CC_A(_))) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//