package Program_14 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[T_B]) extends T_A[B]
case class CC_B[C](a: C, b: T_A[C], c: CC_A[C]) extends T_A[C]
case class CC_C(a: T_B, b: Byte) extends T_B
case class CC_D(a: Boolean, b: CC_A[(Int,Char)], c: T_A[T_B]) extends T_B
case class CC_E[D](a: D) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_E(_), _) => 0 
  case CC_C(CC_C(_, _), 0) => 1 
  case CC_C(CC_D(_, _, _), _) => 2 
}
}
// This is not matched: (CC_C (CC_C Wildcard Wildcard T_B) Wildcard T_B)
// This is not matched: (CC_B T_A)