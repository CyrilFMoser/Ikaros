package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_B, b: D, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_B[CC_A[E]], b: T_A[T_A[T_B, T_B], T_B]) extends T_A[T_A[E, E], E]
case class CC_D(a: T_A[T_A[CC_C[T_B], CC_C[T_B]], CC_C[T_B]], b: CC_B[Boolean]) extends T_B
case class CC_E(a: T_A[CC_A[CC_D], Char], b: T_A[T_A[CC_C[T_B], CC_C[T_B]], CC_C[T_B]]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_B(_, _, _)) => 0 
  case CC_D(CC_B(CC_D(_, _), CC_C(_, _), CC_A(_, _)), CC_B(_, _, _)) => 1 
  case CC_D(CC_B(CC_D(_, _), CC_C(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 2 
  case CC_D(CC_B(CC_D(_, _), CC_C(_, _), CC_C(_, _)), CC_B(_, _, _)) => 3 
  case CC_D(CC_B(CC_E(_, _), CC_C(_, _), CC_A(_, _)), CC_B(_, _, _)) => 4 
  case CC_D(CC_B(CC_E(_, _), CC_C(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 5 
  case CC_D(CC_B(CC_E(_, _), CC_C(_, _), CC_C(_, _)), CC_B(_, _, _)) => 6 
  case CC_D(CC_B(CC_F(), CC_C(_, _), CC_A(_, _)), CC_B(_, _, _)) => 7 
  case CC_D(CC_B(CC_F(), CC_C(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 8 
  case CC_D(CC_B(CC_F(), CC_C(_, _), CC_C(_, _)), CC_B(_, _, _)) => 9 
  case CC_D(CC_C(_, _), CC_B(_, _, _)) => 10 
  case CC_E(_, CC_A(_, _)) => 11 
  case CC_E(_, CC_B(_, _, _)) => 12 
  case CC_E(_, CC_C(CC_B(_, _, _), CC_A(_, _))) => 13 
  case CC_E(_, CC_C(CC_B(_, _, _), CC_B(_, _, _))) => 14 
  case CC_E(_, CC_C(CC_B(_, _, _), CC_C(_, _))) => 15 
  case CC_F() => 16 
}
}