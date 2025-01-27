package Program_62 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B, b: C, c: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[T_B], b: CC_A[T_B, Byte]) extends T_A[Int]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Deleted Pattern CC_A(_, _, CC_A(_, _, _)) at position 1
// This is not matched: (CC_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//