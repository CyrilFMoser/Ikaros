package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: T_B, c: CC_B) extends T_A[T_B]
case class CC_D(a: T_A[T_A[T_B]], b: T_A[CC_B], c: T_A[T_A[T_B]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E() => 0 
}
}
// This is not matched: CC_D(_, _, _)