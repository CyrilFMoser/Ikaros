package Program_29 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean, b: (T_B,T_B)) extends T_A[B]
case class CC_B(a: T_A[Char], b: CC_A[T_B], c: CC_A[T_B]) extends T_A[T_B]
case class CC_C[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C T_B T_B)
// This is not matched: (CC_C Wildcard (CC_C Byte Wildcard T_A) T_A)