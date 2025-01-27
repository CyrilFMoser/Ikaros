package Program_62 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: Byte, b: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[Byte], b: T_B[Int]) extends T_B[T_A[Byte]]
case class CC_C(a: Int) extends T_B[T_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), _) => 0 
}
}
// This is not matched: (CC_B (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))
//      Wildcard
//      (T_B (T_A Byte)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A Boolean Int Boolean Wildcard Wildcard (T_A Boolean Int))
// Mutation information: 
// Deleted Pattern CC_C(_) at position 0