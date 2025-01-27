package Program_57 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[Boolean]) extends T_A[Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 0 to a constant expression:
// {
//  0
// }
//