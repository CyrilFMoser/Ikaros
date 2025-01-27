package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: D, c: D) extends T_A[D, T_A[D, D]]
case class CC_C[E, F]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
  case CC_B(CC_C(), _, _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(_), _, _)