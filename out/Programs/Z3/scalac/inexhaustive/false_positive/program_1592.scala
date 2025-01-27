package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Char (T_A Char))