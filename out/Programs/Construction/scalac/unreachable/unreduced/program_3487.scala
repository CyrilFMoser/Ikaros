package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_B) extends T_A[T_B, C]
case class CC_B(a: Int, b: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_C(a: Byte) extends T_B
case class CC_D(a: CC_B, b: T_A[T_A[T_B, T_B], CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)