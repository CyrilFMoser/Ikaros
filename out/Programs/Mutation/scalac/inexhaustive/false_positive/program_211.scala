package Program_61 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[C, Byte]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 1 to a constant expression:
// {
//  'x'
// }
//