package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C]
case class CC_C[H](a: T_B[H], b: Char) extends T_B[T_A[H]]

val v_a: T_B[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
}
}
// This is not matched: (CC_B T_A)