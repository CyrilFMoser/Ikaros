package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[C, T_A[Byte, Boolean]]

val v_a: T_A[Int, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_A T_A)