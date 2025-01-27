package Program_63 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[Byte], b: B) extends T_A[Byte]
case class CC_B(a: CC_A[T_B], b: T_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), _) => 0 
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _)
// }
//
// This is not matched: (CC_C Wildcard T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//