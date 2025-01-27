package Program_59 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C]) extends T_A[Byte, C]
case class CC_B() extends T_A[Byte, T_A[Boolean, Boolean]]
case class CC_C() extends T_A[Byte, CC_B]

val v_a: T_A[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 2 to a constant expression:
// {
//  0
// }
//