package Program_31 

object Test {
sealed trait T_A[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[T_A[C]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B T_A)