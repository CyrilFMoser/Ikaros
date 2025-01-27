package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: Byte) extends T_A[T_A[T_B, T_B], D]
case class CC_D(a: T_A[Char, (Byte,Byte)], b: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(0)) => 0 
}
}
// This is not matched: (CC_E Wildcard Wildcard T_B)