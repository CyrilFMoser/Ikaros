package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Int) extends T_A[T_A[T_B[E, E], E], E]
case class CC_B[F, G](a: T_B[F, F], b: T_B[F, F], c: G) extends T_B[F, G]
case class CC_C[H, I](a: T_B[H, I], b: CC_B[I, H], c: T_A[H, I]) extends T_B[H, I]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _, _), 'x'), _) => 0 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 1 
  case CC_B(_, CC_B(_, CC_C(_, _, _), 'x'), _) => 2 
  case CC_B(_, CC_C(CC_B(_, _, _), _, _), _) => 3 
  case CC_B(_, CC_C(CC_C(_, _, _), _, _), _) => 4 
  case CC_C(CC_B(_, CC_B(_, _, _), 12), CC_B(CC_B(_, _, _), _, 'x'), _) => 5 
  case CC_C(CC_B(_, CC_B(_, _, _), 12), CC_B(CC_C(_, _, _), _, 'x'), _) => 6 
  case CC_C(CC_B(_, CC_B(_, _, _), 12), CC_B(CC_B(_, _, _), _, _), _) => 7 
  case CC_C(CC_B(_, CC_B(_, _, _), 12), CC_B(CC_C(_, _, _), _, _), _) => 8 
  case CC_C(CC_B(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, 'x'), _) => 9 
  case CC_C(CC_B(_, CC_B(_, _, _), _), CC_B(CC_C(_, _, _), _, 'x'), _) => 10 
  case CC_C(CC_B(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, _), _) => 11 
  case CC_C(CC_B(_, CC_B(_, _, _), _), CC_B(CC_C(_, _, _), _, _), _) => 12 
  case CC_C(CC_B(_, CC_C(_, _, _), 12), CC_B(CC_B(_, _, _), _, 'x'), _) => 13 
  case CC_C(CC_B(_, CC_C(_, _, _), 12), CC_B(CC_C(_, _, _), _, 'x'), _) => 14 
  case CC_C(CC_B(_, CC_C(_, _, _), 12), CC_B(CC_B(_, _, _), _, _), _) => 15 
  case CC_C(CC_B(_, CC_C(_, _, _), 12), CC_B(CC_C(_, _, _), _, _), _) => 16 
  case CC_C(CC_B(_, CC_C(_, _, _), _), CC_B(CC_B(_, _, _), _, 'x'), _) => 17 
  case CC_C(CC_B(_, CC_C(_, _, _), _), CC_B(CC_C(_, _, _), _, 'x'), _) => 18 
  case CC_C(CC_B(_, CC_C(_, _, _), _), CC_B(CC_B(_, _, _), _, _), _) => 19 
  case CC_C(CC_B(_, CC_C(_, _, _), _), CC_B(CC_C(_, _, _), _, _), _) => 20 
  case CC_C(CC_C(_, _, _), CC_B(CC_B(_, _, _), _, 'x'), _) => 21 
  case CC_C(CC_C(_, _, _), CC_B(CC_C(_, _, _), _, 'x'), _) => 22 
  case CC_C(CC_C(_, _, _), CC_B(CC_B(_, _, _), _, _), _) => 23 
  case CC_C(CC_C(_, _, _), CC_B(CC_C(_, _, _), _, _), _) => 24 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_C(_, _, _), _), _)