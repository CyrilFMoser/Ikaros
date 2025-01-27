package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: Boolean, b: T_B[CC_B]) extends T_A
case class CC_D[B, C](a: B) extends T_B[B]
case class CC_E() extends T_B[(Boolean,CC_C)]
case class CC_F(a: T_A, b: CC_D[CC_C, (Byte,Boolean)]) extends T_B[(Boolean,CC_C)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_)) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_D (CC_B T_A T_A) T_A Wildcard (T_B (CC_B T_A T_A))) T_A)
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A Boolean (T_A Byte Int)))