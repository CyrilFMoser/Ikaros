package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[Char, T_A[Byte, Boolean]]) extends T_A[Byte, Boolean]
case class CC_B[C](a: T_B, b: T_A[Byte, Boolean], c: T_A[C, C]) extends T_A[Byte, C]
case class CC_C(a: T_A[Byte, T_A[Byte, Boolean]], b: CC_B[CC_A], c: CC_B[(CC_A,CC_A)]) extends T_A[Byte, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)