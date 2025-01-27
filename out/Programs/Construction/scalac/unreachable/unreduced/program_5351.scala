package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D, E](a: (Char,T_A[T_B, T_B]), b: E, c: Char) extends T_A[T_B, D]
case class CC_C(a: CC_B[Int, T_A[T_B, T_B]], b: T_A[T_B, Boolean]) extends T_B
case class CC_D(a: CC_B[T_A[T_B, T_B], CC_A[T_B]], b: CC_A[CC_B[T_B, CC_C]], c: Char) extends T_B
case class CC_E(a: T_B, b: CC_C) extends T_B

val v_a: T_A[T_B, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_C(CC_B(_, _, _), CC_B(_, _, _)), _) => 1 
  case CC_A(CC_D(CC_B(_, _, _), CC_A(_, _), 'x'), _) => 2 
  case CC_A(CC_D(CC_B(_, _, _), CC_A(_, _), _), _) => 3 
  case CC_A(CC_E(CC_C(_, _), CC_C(_, _)), _) => 4 
  case CC_A(CC_E(CC_D(_, _, _), CC_C(_, _)), _) => 5 
  case CC_A(CC_E(CC_E(_, _), CC_C(_, _)), _) => 6 
  case CC_B((_,CC_A(_, _)), _, _) => 7 
  case CC_B((_,CC_B(_, _, _)), _, _) => 8 
}
}