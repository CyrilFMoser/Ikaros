package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_B[T_A, T_A], T_A], c: T_B[Boolean, (Int,T_A)]) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: T_B[T_B[(Char,Int), Int], T_B[T_A, T_A]]) extends T_A
case class CC_C[C](a: CC_B, b: CC_A) extends T_B[CC_B, C]
case class CC_D[D](a: T_A, b: T_B[CC_B, D], c: Char) extends T_B[CC_B, D]
case class CC_E[E](a: T_A, b: CC_C[E], c: CC_C[E]) extends T_B[CC_B, E]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _) => 0 
  case CC_D(CC_A(_, _, _), CC_C(_, _), 'x') => 1 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_C(_, _), 'x'), 'x') => 2 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_D(_, _, _), 'x'), 'x') => 3 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_E(_, _, _), 'x'), 'x') => 4 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_C(_, _), _), 'x') => 5 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_D(_, _, _), _), 'x') => 6 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_E(_, _, _), _), 'x') => 7 
  case CC_D(CC_A(_, _, _), CC_E(CC_A(_, _, _), CC_C(_, _), CC_C(_, _)), 'x') => 8 
  case CC_D(CC_A(_, _, _), CC_E(CC_B(_, _), CC_C(_, _), CC_C(_, _)), 'x') => 9 
  case CC_D(CC_B(_, _), CC_C(_, _), 'x') => 10 
  case CC_D(CC_B(_, _), CC_D(_, CC_C(_, _), 'x'), 'x') => 11 
  case CC_D(CC_B(_, _), CC_D(_, CC_D(_, _, _), 'x'), 'x') => 12 
  case CC_D(CC_B(_, _), CC_D(_, CC_E(_, _, _), 'x'), 'x') => 13 
  case CC_D(CC_B(_, _), CC_D(_, CC_C(_, _), _), 'x') => 14 
  case CC_D(CC_B(_, _), CC_D(_, CC_D(_, _, _), _), 'x') => 15 
  case CC_D(CC_B(_, _), CC_D(_, CC_E(_, _, _), _), 'x') => 16 
  case CC_D(CC_B(_, _), CC_E(CC_A(_, _, _), CC_C(_, _), CC_C(_, _)), 'x') => 17 
  case CC_D(CC_B(_, _), CC_E(CC_B(_, _), CC_C(_, _), CC_C(_, _)), 'x') => 18 
  case CC_D(CC_A(_, _, _), CC_C(_, _), _) => 19 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_C(_, _), 'x'), _) => 20 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_D(_, _, _), 'x'), _) => 21 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_E(_, _, _), 'x'), _) => 22 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_C(_, _), _), _) => 23 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_D(_, _, _), _), _) => 24 
  case CC_D(CC_A(_, _, _), CC_D(_, CC_E(_, _, _), _), _) => 25 
  case CC_D(CC_A(_, _, _), CC_E(CC_A(_, _, _), CC_C(_, _), CC_C(_, _)), _) => 26 
  case CC_D(CC_B(_, _), CC_C(_, _), _) => 27 
  case CC_D(CC_B(_, _), CC_D(_, CC_C(_, _), 'x'), _) => 28 
  case CC_D(CC_B(_, _), CC_D(_, CC_D(_, _, _), 'x'), _) => 29 
  case CC_D(CC_B(_, _), CC_D(_, CC_E(_, _, _), 'x'), _) => 30 
  case CC_D(CC_B(_, _), CC_D(_, CC_C(_, _), _), _) => 31 
  case CC_D(CC_B(_, _), CC_D(_, CC_D(_, _, _), _), _) => 32 
  case CC_D(CC_B(_, _), CC_D(_, CC_E(_, _, _), _), _) => 33 
  case CC_D(CC_B(_, _), CC_E(CC_A(_, _, _), CC_C(_, _), CC_C(_, _)), _) => 34 
  case CC_D(CC_B(_, _), CC_E(CC_B(_, _), CC_C(_, _), CC_C(_, _)), _) => 35 
  case CC_E(_, _, _) => 36 
}
}
// This is not matched: CC_D(CC_A(_, _, _), CC_E(CC_B(_, _), CC_C(_, _), CC_C(_, _)), _)