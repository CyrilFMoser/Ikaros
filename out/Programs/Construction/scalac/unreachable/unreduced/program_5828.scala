package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[CC_A[E, E], E], b: CC_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}