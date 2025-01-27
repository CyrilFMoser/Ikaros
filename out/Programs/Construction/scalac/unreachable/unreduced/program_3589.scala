package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, Boolean], C]) extends T_A[T_A[C, Boolean], C]
case class CC_B[D](a: T_B, b: Int) extends T_A[T_A[D, Boolean], D]
case class CC_C(a: CC_B[T_B], b: T_A[CC_B[T_B], (Int,T_B)]) extends T_B
case class CC_D[E](a: T_A[T_A[E, Boolean], E], b: T_A[T_A[CC_C, Boolean], CC_C]) extends T_B

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_A(CC_A(_))) => 0 
  case CC_D(CC_B(CC_C(_, _), _), CC_A(CC_A(_))) => 1 
  case CC_D(CC_B(CC_D(_, _), _), CC_A(CC_A(_))) => 2 
  case CC_D(CC_A(_), CC_A(CC_B(_, _))) => 3 
  case CC_D(CC_B(CC_C(_, _), _), CC_A(CC_B(_, _))) => 4 
  case CC_D(CC_B(CC_D(_, _), _), CC_A(CC_B(_, _))) => 5 
  case CC_D(CC_A(_), CC_B(CC_C(_, _), _)) => 6 
  case CC_D(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), _)) => 7 
  case CC_D(CC_B(CC_D(_, _), _), CC_B(CC_C(_, _), _)) => 8 
  case CC_D(CC_A(_), CC_B(CC_D(_, _), _)) => 9 
  case CC_D(CC_B(CC_C(_, _), _), CC_B(CC_D(_, _), _)) => 10 
  case CC_D(CC_B(CC_D(_, _), _), CC_B(CC_D(_, _), _)) => 11 
}
}