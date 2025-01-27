package Program_63 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_D Char Wildcard Wildcard (T_B Char))
//      Wildcard
//      (T_A (T_A Byte)))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//