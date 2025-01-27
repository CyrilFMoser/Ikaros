package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: T_A[D, T_A[D, D]], c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: Byte) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}