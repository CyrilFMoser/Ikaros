package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: T_A[Boolean, Byte]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[G, H]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B())) => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//