package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: T_A[D, T_A[D, D]], c: Char) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_), CC_A(_)) => 2 
  case CC_C(CC_A(_), CC_B(_, _, _)) => 3 
  case CC_C(CC_A(_), CC_C(_, _)) => 4 
  case CC_C(CC_B(_, _, _), CC_A(_)) => 5 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 6 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 7 
  case CC_C(CC_C(_, CC_A(_)), CC_A(_)) => 8 
  case CC_C(CC_C(_, CC_A(_)), CC_B(_, _, _)) => 9 
  case CC_C(CC_C(_, CC_A(_)), CC_C(_, _)) => 10 
  case CC_C(CC_C(_, CC_B(_, _, _)), CC_A(_)) => 11 
  case CC_C(CC_C(_, CC_B(_, _, _)), CC_B(_, _, _)) => 12 
  case CC_C(CC_C(_, CC_B(_, _, _)), CC_C(_, _)) => 13 
  case CC_C(CC_C(_, CC_C(_, _)), CC_A(_)) => 14 
  case CC_C(CC_C(_, CC_C(_, _)), CC_B(_, _, _)) => 15 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(_, _)) => 16 
}
}