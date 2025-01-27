package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B), T_A[T_B, T_B]], b: (T_B,T_B), c: Int) extends T_A[(Boolean,T_A[T_B, T_B]), T_B]
case class CC_B(a: T_A[CC_A, CC_A], b: T_B) extends T_A[(Boolean,T_A[T_B, T_B]), T_B]
case class CC_C(a: Int, b: T_B) extends T_A[(Boolean,T_A[T_B, T_B]), T_B]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: Int, b: CC_B, c: Char) extends T_B
case class CC_F[C](a: C, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
  case CC_D(CC_D(CC_E(_, _, _))) => 1 
  case CC_D(CC_D(CC_F(_, _))) => 2 
  case CC_D(CC_E(_, _, _)) => 3 
  case CC_D(CC_F(_, _)) => 4 
  case CC_E(12, _, _) => 5 
  case CC_F(_, CC_D(_)) => 6 
  case CC_F(_, CC_E(_, CC_B(_, _), _)) => 7 
  case CC_F(_, CC_F(_, _)) => 8 
}
}
// This is not matched: CC_E(_, _, _)