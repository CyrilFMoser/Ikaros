package Program_31 

package Program_11 

object Test {
sealed trait T_A
case class CC_A[A](a: Byte, b: A, c: T_A) extends T_A
case class CC_B(a: Byte, b: CC_A[T_A], c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0, _, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Int (CC_D Int (T_B Int)) Wildcard (T_B Int))