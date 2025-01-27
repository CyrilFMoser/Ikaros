package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, CC_A[D]], b: T_A[D, D], c: Char) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[(Int,Int), T_A[(Int,Int), (Int,Int)]], b: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, CC_A(_, _)) => 0 
  case CC_A(false, CC_A(_, _)) => 1 
  case CC_A(true, CC_B(_, _, _)) => 2 
  case CC_A(false, CC_B(_, _, _)) => 3 
  case CC_A(true, CC_C(_, _)) => 4 
  case CC_A(false, CC_C(_, _)) => 5 
}
}