package Program_31 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A
case class CC_B(a: CC_A[(Char,Boolean)], b: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_A(_)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A Boolean (CC_A Boolean Wildcard (T_A Boolean)) (T_A Boolean))