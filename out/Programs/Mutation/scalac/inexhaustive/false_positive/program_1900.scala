package Program_29 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[Int]
case class CC_B[B](a: B) extends T_A[(CC_A,(Int,Char))]
case class CC_C(a: T_A[Int], b: CC_B[Char]) extends T_A[CC_B[CC_A]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//