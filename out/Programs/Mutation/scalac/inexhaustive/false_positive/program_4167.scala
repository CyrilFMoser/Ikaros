package Program_18 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte) extends T_A[D]
case class CC_B[E]() extends T_A[T_B[(Int,Byte), Boolean]]

val v_a: T_A[T_B[(Int,Byte), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 2 
}
}
// This is not matched: (CC_B Boolean (T_A (T_B (Tuple Int Byte) Boolean)))
// Mutation information: 
// Deleted Pattern CC_A(0) at position 1
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//