package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[T_B, T_A[T_B, T_B]], b: T_B) extends T_A[C, T_A[T_B, T_B]]
case class CC_B[E](a: T_A[T_B, T_A[T_B, T_B]], b: T_A[E, T_A[T_B, T_B]], c: T_A[E, E]) extends T_A[E, T_A[T_B, T_B]]
case class CC_C(a: CC_B[Char], b: T_A[CC_A[T_B, T_B], T_B]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_C(CC_B(_, _, _), _)) => 0 
  case CC_A(CC_A(_, _), CC_D()) => 1 
  case CC_A(CC_A(_, _), CC_E(CC_C(_, _))) => 2 
  case CC_A(CC_A(_, _), CC_E(CC_E(_))) => 3 
  case CC_A(CC_B(_, _, _), CC_C(CC_B(_, _, _), _)) => 4 
  case CC_A(CC_B(_, _, _), CC_D()) => 5 
  case CC_A(CC_B(_, _, _), CC_E(CC_C(_, _))) => 6 
  case CC_A(CC_B(_, _, _), CC_E(CC_D())) => 7 
  case CC_A(CC_B(_, _, _), CC_E(CC_E(_))) => 8 
}
}
// This is not matched: CC_A(CC_A(_, _), CC_E(CC_D()))