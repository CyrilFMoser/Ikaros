package Program_31 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A
case class CC_B(a: T_A, b: CC_A[Char]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard T_A)