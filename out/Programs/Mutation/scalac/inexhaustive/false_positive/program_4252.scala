package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_D Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 3 to a constant expression:
// {
//  0
// }
//