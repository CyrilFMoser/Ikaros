package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_B[E]]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_B T_A)