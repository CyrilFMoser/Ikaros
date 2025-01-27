package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: Char, b: T_A[T_A[T_B, Int], (Byte,T_B)]) extends T_B
case class CC_D(a: Boolean, b: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_E(a: T_B, b: T_A[T_B, Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, CC_A()) => 2 
}
}
// This is not matched: CC_E(_, CC_B())