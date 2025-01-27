package Program_53 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: (Byte,Char), b: T_B[Int]) extends T_B[T_A[Char, Byte]]

val v_a: T_B[T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_B((_,'x'), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_B (T_A Char Byte)))
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 6 to a constant expression:
// {
//  'x'
// }
//