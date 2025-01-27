package Program_63 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Byte], b: T_A[Char, Boolean]) extends T_A[(Int,(Int,Boolean)), T_A[Int, Byte]]
case class CC_B[C, D](a: CC_A, b: Byte) extends T_A[C, CC_A]
case class CC_C[E](a: Byte) extends T_A[E, CC_A]

val v_a: T_A[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B Byte
//      Boolean
//      Wildcard
//      Byte
//      (T_A Byte (CC_A Boolean (T_A Boolean Boolean) Boolean)))
// This is not matched: (CC_C Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_B(_, _, _)
//  CC_C(_, _)
// }
//