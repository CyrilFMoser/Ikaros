package Program_14 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A
case class CC_B(a: CC_A[Char]) extends T_B
case class CC_C(a: CC_B, b: (T_A,(Boolean,Int))) extends T_B
case class CC_D(a: Byte, b: (T_A,CC_B)) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)