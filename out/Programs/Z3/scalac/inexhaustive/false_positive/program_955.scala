package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: Boolean, b: T_A) extends T_A
case class CC_B(a: CC_A[T_A], b: CC_A[Boolean], c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(_, _, CC_A(_, _)) => 3 
  case CC_B(_, CC_A(_, _), _) => 4 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Int Char) Boolean))