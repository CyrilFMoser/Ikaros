package Program_63 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: T_B, c: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C T_A T_B)
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
// }
//