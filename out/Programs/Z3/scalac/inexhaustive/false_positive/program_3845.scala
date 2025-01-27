package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,T_B), b: T_A[B]) extends T_A[B]
case class CC_B[C](a: Boolean, b: C) extends T_A[C]
case class CC_C[D](a: Boolean, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_C Byte (T_B Byte))