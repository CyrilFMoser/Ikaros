package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[B], b: T_A[B], c: T_A[T_B]) extends T_A[B]
case class CC_B(a: T_A[Int], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: Char, b: T_A[T_B]) extends T_A[Boolean]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_A(_, CC_A(_, _, _), _) => 2 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 3 
  case CC_A(_, _, CC_A(_, _, _)) => 4 
  case CC_A(_, _, _) => 5 
  case CC_A(CC_A(_, _, _), _, _) => 6 
}
}
// This is not matched: (CC_A Int (CC_B T_B T_B T_B) Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: (CC_B Wildcard (CC_B (CC_A T_A T_A) Wildcard Wildcard T_A) Wildcard T_A)