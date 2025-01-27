package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[(Byte,Int)]) extends T_A[T_B[Byte, Int]]

val v_a: T_A[T_B[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_C T_A)