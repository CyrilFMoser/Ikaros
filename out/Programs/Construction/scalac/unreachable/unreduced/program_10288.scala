package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[CC_A, Char], T_B[CC_A, T_A]], b: T_A, c: CC_A) extends T_A
case class CC_C[C](a: C) extends T_B[T_A, C]
case class CC_D[D]() extends T_B[T_A, D]
case class CC_E[E](a: T_B[E, E], b: Boolean, c: E) extends T_B[T_A, E]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_))) => 0 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_D())) => 1 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_E(_, _, _))) => 2 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_C(_))) => 3 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_D())) => 4 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_E(_, _, _))) => 5 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_, _, _), CC_C(_))) => 6 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_, _, _), CC_D())) => 7 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_, _, _), CC_E(_, _, _))) => 8 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_C(_))) => 9 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_D())) => 10 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_E(_, _, _))) => 11 
  case CC_C(CC_B(_, CC_A(_, _, _), _)) => 12 
  case CC_C(CC_B(_, CC_B(_, _, _), _)) => 13 
  case CC_D() => 14 
  case CC_E(_, _, _) => 15 
}
}