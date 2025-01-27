package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: Byte, c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: Boolean) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(12, _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A(_, _, _), CC_A(0, _, _)) => 4 
  case CC_C(CC_B(_, _), CC_A(0, _, _)) => 5 
  case CC_C(CC_C(_, _), CC_A(0, _, _)) => 6 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 7 
  case CC_C(CC_B(_, _), CC_A(_, _, _)) => 8 
  case CC_C(CC_C(_, _), CC_A(_, _, _)) => 9 
}
}