package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[E, D](a: Char, b: T_A[T_A[E, E], E], c: CC_A[D]) extends T_A[D, E]
case class CC_C(a: CC_A[CC_A[T_B]], b: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_)), CC_A(CC_A(_))) => 0 
  case CC_C(CC_A(CC_B(_, _, _)), CC_A(CC_A(_))) => 1 
  case CC_C(CC_A(CC_A(_)), CC_A(CC_B(_, _, _))) => 2 
  case CC_C(CC_A(CC_B(_, _, _)), CC_A(CC_B(_, _, _))) => 3 
  case CC_C(CC_A(CC_A(_)), CC_B(_, CC_A(_), _)) => 4 
  case CC_C(CC_A(CC_B(_, _, _)), CC_B(_, CC_A(_), _)) => 5 
  case CC_C(CC_A(CC_A(_)), CC_B(_, CC_B(_, _, _), _)) => 6 
  case CC_C(CC_A(CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), _)) => 7 
}
}