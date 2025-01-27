package Program_29 

object Test {
sealed trait T_A[A]
case class CC_B(a: Byte, b: T_A[(Char,Byte)]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)