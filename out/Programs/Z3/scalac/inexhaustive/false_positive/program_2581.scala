package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[Int], c: T_B[T_A]) extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: Boolean) extends T_A
case class CC_C[B](a: B, b: B) extends T_A
case class CC_D(a: Int, b: CC_C[T_A]) extends T_B[T_B[Int]]
case class CC_E() extends T_B[T_B[Int]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_C(_, _) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B (CC_B Wildcard Wildcard Wildcard T_B) Wildcard Wildcard T_B)