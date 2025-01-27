package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_B,T_A[T_B, Boolean]), c: Int) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C(a: Char, b: T_B) extends T_A[T_A[T_B, T_B], T_B]
case class CC_D(a: Int) extends T_B
case class CC_E(a: Boolean, b: T_A[CC_D, Boolean], c: T_B) extends T_B
case class CC_F(a: T_B, b: CC_E) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_)) => 0 
  case CC_C(_, CC_E(true, _, CC_D(_))) => 1 
  case CC_C(_, CC_E(true, _, CC_E(_, _, _))) => 2 
  case CC_C(_, CC_E(true, _, CC_F(_, _))) => 3 
  case CC_C(_, CC_E(false, _, CC_D(_))) => 4 
  case CC_C(_, CC_E(false, _, CC_E(_, _, _))) => 5 
  case CC_C(_, CC_E(false, _, CC_F(_, _))) => 6 
  case CC_C(_, CC_F(CC_D(_), CC_E(_, _, _))) => 7 
  case CC_C(_, CC_F(CC_E(_, _, _), CC_E(_, _, _))) => 8 
  case CC_C(_, CC_F(CC_F(_, _), CC_E(_, _, _))) => 9 
}
}