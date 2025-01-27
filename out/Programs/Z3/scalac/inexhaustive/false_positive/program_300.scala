package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B[D, E](a: T_A[E], b: E) extends T_B[E, D]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_B (Tuple T_B T_B) Wildcard Wildcard Wildcard (T_A (Tuple T_B T_B)))