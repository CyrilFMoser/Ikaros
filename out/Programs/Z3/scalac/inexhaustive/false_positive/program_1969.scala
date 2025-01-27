package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Int, b: T_B[B]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_B[CC_A[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_B Char (T_A T_B Char))