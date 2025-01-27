package Program_55 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A]) extends T_A
case class CC_D() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 3 to a constant expression:
// {
//  0
// }
//