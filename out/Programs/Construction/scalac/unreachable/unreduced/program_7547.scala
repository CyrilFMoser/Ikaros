package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Char, T_A[Int, Boolean]]]
case class CC_B[D](a: T_A[D, D], b: T_A[Char, D], c: Int) extends T_A[D, T_A[Char, T_A[Int, Boolean]]]
case class CC_C[E](a: E) extends T_A[E, T_A[Char, T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[Char, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, 12) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_B(_, _, _)