package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_B, C]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A T_A)