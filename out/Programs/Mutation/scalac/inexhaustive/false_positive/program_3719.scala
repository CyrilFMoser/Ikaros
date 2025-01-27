package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Char) extends T_A[E, F]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//