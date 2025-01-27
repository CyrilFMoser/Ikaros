package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_B[Char]], c: T_A[T_A[(Char,Boolean)]]) extends T_A[T_B[Char]]
case class CC_B[C](a: C, b: T_B[C], c: Int) extends T_B[C]
case class CC_C[D](a: T_B[D]) extends T_B[D]
case class CC_D[E](a: T_B[E], b: CC_C[E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(CC_A(_, _, _), CC_B(_, _, _), _)) => 1 
  case CC_C(CC_B(CC_A(_, _, _), CC_C(_), _)) => 2 
  case CC_C(CC_B(CC_A(_, _, _), CC_D(_, _), _)) => 3 
  case CC_C(CC_C(CC_B(_, _, _))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
  case CC_C(CC_C(CC_D(_, _))) => 6 
  case CC_C(CC_D(CC_B(_, _, _), CC_C(_))) => 7 
  case CC_C(CC_D(CC_C(_), CC_C(_))) => 8 
  case CC_C(CC_D(CC_D(_, _), CC_C(_))) => 9 
  case CC_D(CC_B(CC_A(_, _, _), CC_B(_, _, _), _), CC_C(CC_B(_, _, _))) => 10 
  case CC_D(CC_B(CC_A(_, _, _), CC_C(_), _), CC_C(CC_B(_, _, _))) => 11 
  case CC_D(CC_B(CC_A(_, _, _), CC_D(_, _), _), CC_C(CC_B(_, _, _))) => 12 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_B(_, _, _))) => 13 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_B(_, _, _))) => 14 
  case CC_D(CC_C(CC_D(_, _)), CC_C(CC_B(_, _, _))) => 15 
  case CC_D(CC_D(CC_B(_, _, _), CC_C(_)), CC_C(CC_B(_, _, _))) => 16 
  case CC_D(CC_D(CC_C(_), CC_C(_)), CC_C(CC_B(_, _, _))) => 17 
  case CC_D(CC_D(CC_D(_, _), CC_C(_)), CC_C(CC_B(_, _, _))) => 18 
  case CC_D(CC_B(CC_A(_, _, _), CC_B(_, _, _), _), CC_C(CC_C(_))) => 19 
  case CC_D(CC_B(CC_A(_, _, _), CC_C(_), _), CC_C(CC_C(_))) => 20 
  case CC_D(CC_B(CC_A(_, _, _), CC_D(_, _), _), CC_C(CC_C(_))) => 21 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_C(_))) => 22 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_C(_))) => 23 
  case CC_D(CC_C(CC_D(_, _)), CC_C(CC_C(_))) => 24 
  case CC_D(CC_D(CC_B(_, _, _), CC_C(_)), CC_C(CC_C(_))) => 25 
  case CC_D(CC_D(CC_C(_), CC_C(_)), CC_C(CC_C(_))) => 26 
  case CC_D(CC_D(CC_D(_, _), CC_C(_)), CC_C(CC_C(_))) => 27 
  case CC_D(CC_B(CC_A(_, _, _), CC_C(_), _), CC_C(CC_D(_, _))) => 28 
  case CC_D(CC_B(CC_A(_, _, _), CC_D(_, _), _), CC_C(CC_D(_, _))) => 29 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_D(_, _))) => 30 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_D(_, _))) => 31 
  case CC_D(CC_C(CC_D(_, _)), CC_C(CC_D(_, _))) => 32 
  case CC_D(CC_D(CC_B(_, _, _), CC_C(_)), CC_C(CC_D(_, _))) => 33 
  case CC_D(CC_D(CC_C(_), CC_C(_)), CC_C(CC_D(_, _))) => 34 
  case CC_D(CC_D(CC_D(_, _), CC_C(_)), CC_C(CC_D(_, _))) => 35 
}
}
// This is not matched: CC_D(CC_B(CC_A(_, _, _), CC_B(_, _, _), _), CC_C(CC_D(_, _)))