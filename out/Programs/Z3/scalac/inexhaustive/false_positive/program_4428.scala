package Program_15 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char, c: T_B[T_A]) extends T_A
case class CC_B[B, C]() extends T_B[B]
case class CC_C(a: T_A, b: Byte, c: T_B[CC_A]) extends T_B[T_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A T_A) T_A (T_B (CC_A T_A T_A T_A T_A)))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)