package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B() extends T_A[Char]
case class CC_C[B](a: Byte, b: T_A[Char], c: T_A[Char]) extends T_A[B]

val v_a: CC_C[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 0 to a constant expression:
// {
//  'x'
// }
//