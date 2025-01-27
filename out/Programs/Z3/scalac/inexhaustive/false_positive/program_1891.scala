package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean, b: B, c: T_A[B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_A T_B Boolean Wildcard Wildcard (T_A T_B)) T_B)
// This is not matched: (CC_B Int Int (T_A Int Int))