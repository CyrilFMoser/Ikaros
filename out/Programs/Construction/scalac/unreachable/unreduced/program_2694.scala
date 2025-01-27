package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_B[Boolean]], D]
case class CC_B[E](a: T_B[E], b: T_B[E], c: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: T_B[F], b: Char) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 0 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 1 
  case CC_B(CC_C(CC_B(_, _, _), _), _, _) => 2 
  case CC_B(CC_C(CC_C(_, _), _), _, _) => 3 
  case CC_C(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), 'x') => 4 
  case CC_C(CC_B(CC_C(_, _), CC_B(_, _, _), _), 'x') => 5 
  case CC_C(CC_B(CC_B(_, _, _), CC_C(_, _), _), 'x') => 6 
  case CC_C(CC_B(CC_C(_, _), CC_C(_, _), _), 'x') => 7 
  case CC_C(CC_C(CC_B(_, _, _), 'x'), 'x') => 8 
  case CC_C(CC_C(CC_B(_, _, _), _), 'x') => 9 
  case CC_C(CC_C(CC_C(_, _), 'x'), 'x') => 10 
  case CC_C(CC_C(CC_C(_, _), _), 'x') => 11 
  case CC_C(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 12 
  case CC_C(CC_B(CC_C(_, _), CC_B(_, _, _), _), _) => 13 
  case CC_C(CC_B(CC_B(_, _, _), CC_C(_, _), _), _) => 14 
  case CC_C(CC_B(CC_C(_, _), CC_C(_, _), _), _) => 15 
  case CC_C(CC_C(CC_B(_, _, _), 'x'), _) => 16 
  case CC_C(CC_C(CC_B(_, _, _), _), _) => 17 
  case CC_C(CC_C(CC_C(_, _), 'x'), _) => 18 
  case CC_C(CC_C(CC_C(_, _), _), _) => 19 
}
}