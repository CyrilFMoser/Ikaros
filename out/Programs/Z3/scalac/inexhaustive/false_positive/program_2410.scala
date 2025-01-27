package Program_30 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: (T_A,T_A), c: T_A) extends T_A
case class CC_B[B](a: Boolean, b: CC_A[B], c: CC_A[B]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D T_A T_B)
// This is not matched: (CC_B T_A T_A)