package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: Byte, b: T_A[T_B, D], c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: CC_B[T_A[T_B, T_B]], b: CC_B[T_B], c: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_D(a: T_A[Boolean, T_A[CC_C, T_B]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _), CC_B(_, _, _), _)