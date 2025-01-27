package Program_15 

package Program_3 

object Test {
sealed trait T_A
case class CC_A[A](a: Boolean, b: T_A, c: A) extends T_A
case class CC_B(a: CC_A[T_A], b: T_A, c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _, _), _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, CC_A(_, _, _), _) => 2 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 3 
}
}
// This is not matched: (CC_B Wildcard (CC_A T_A Boolean Wildcard Wildcard T_A) Wildcard T_A)
// This is not matched: (CC_A Int Int (CC_B Int Int (T_A Int Int)) (T_A Int Int))