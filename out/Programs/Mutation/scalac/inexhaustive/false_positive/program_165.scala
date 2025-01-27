package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Byte, (Char,Char)], C]

val v_a: T_A[T_A[Byte, (Char,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 0 to a constant expression:
// {
//  'x'
// }
//