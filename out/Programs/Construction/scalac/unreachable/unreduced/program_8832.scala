package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[D, T_B], b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[E](a: T_B, b: T_A[E, T_B], c: T_B) extends T_A[E, T_B]
case class CC_C[F]() extends T_A[F, T_B]
case class CC_D(a: T_A[T_B, T_B]) extends T_B
case class CC_E(a: CC_C[T_B], b: ((CC_D,T_B),CC_C[T_B]), c: Int) extends T_B
case class CC_F(a: T_A[CC_C[CC_D], CC_D], b: T_A[CC_D, T_A[Byte, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _))) => 0 
  case CC_D(CC_A(_, CC_B(_, _, _))) => 1 
  case CC_D(CC_B(CC_D(_), CC_A(_, _), _)) => 2 
  case CC_D(CC_B(CC_D(_), CC_B(_, _, _), _)) => 3 
  case CC_D(CC_B(CC_D(_), CC_C(), _)) => 4 
  case CC_D(CC_B(CC_E(_, _, _), CC_A(_, _), _)) => 5 
  case CC_D(CC_B(CC_E(_, _, _), CC_B(_, _, _), _)) => 6 
  case CC_D(CC_B(CC_E(_, _, _), CC_C(), _)) => 7 
  case CC_D(CC_B(CC_F(_, _), CC_A(_, _), _)) => 8 
  case CC_D(CC_B(CC_F(_, _), CC_B(_, _, _), _)) => 9 
  case CC_D(CC_B(CC_F(_, _), CC_C(), _)) => 10 
  case CC_D(CC_C()) => 11 
  case CC_E(CC_C(), _, _) => 12 
  case CC_F(_, _) => 13 
}
}
// This is not matched: CC_D(CC_A(_, CC_C()))