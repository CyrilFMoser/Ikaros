package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: Int) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, E], b: CC_A[CC_B[Int]], c: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}