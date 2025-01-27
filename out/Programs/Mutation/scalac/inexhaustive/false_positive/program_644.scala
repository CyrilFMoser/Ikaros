package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[(Byte,Boolean), Char], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A Int Byte) (Tuple Char Boolean)))
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 6 to a constant expression:
// {
//  'x'
// }
//