package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C](a: C, b: Char) extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), true, _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), false, _) => 1 
  case CC_A(CC_A(CC_B(_, _), _, _), true, _) => 2 
  case CC_A(CC_A(CC_B(_, _), _, _), false, _) => 3 
  case CC_A(CC_A(CC_C(_), _, _), true, _) => 4 
  case CC_A(CC_A(CC_C(_), _, _), false, _) => 5 
  case CC_A(CC_B(_, _), true, _) => 6 
  case CC_A(CC_B(_, _), false, _) => 7 
  case CC_A(CC_C(CC_A(_, _, _)), true, _) => 8 
  case CC_A(CC_C(CC_A(_, _, _)), false, _) => 9 
  case CC_A(CC_C(CC_B(_, _)), true, _) => 10 
  case CC_A(CC_C(CC_B(_, _)), false, _) => 11 
  case CC_A(CC_C(CC_C(_)), true, _) => 12 
  case CC_A(CC_C(CC_C(_)), false, _) => 13 
  case CC_B(true, 'x') => 14 
  case CC_B(false, 'x') => 15 
  case CC_B(true, _) => 16 
  case CC_B(false, _) => 17 
  case CC_C(CC_A(_, _, _)) => 18 
  case CC_C(CC_B(_, _)) => 19 
  case CC_C(CC_C(CC_A(_, _, _))) => 20 
  case CC_C(CC_C(CC_B(_, _))) => 21 
  case CC_C(CC_C(CC_C(_))) => 22 
}
}