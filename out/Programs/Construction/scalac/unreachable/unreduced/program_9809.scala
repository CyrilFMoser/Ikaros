package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[T_A[T_A[Int, T_B], T_B], D]
case class CC_C[E](a: ((T_B,T_B),T_B), b: E) extends T_A[E, T_B]
case class CC_D(a: CC_B[T_A[T_B, T_B]], b: Byte) extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F(a: CC_A[Boolean], b: T_A[T_A[T_B, CC_E], CC_E], c: CC_C[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _) => 0 
  case CC_E(CC_D(CC_B(), _)) => 1 
  case CC_E(CC_E(CC_D(_, _))) => 2 
  case CC_E(CC_E(CC_E(_))) => 3 
  case CC_E(CC_E(CC_F(_, _, _))) => 4 
  case CC_E(CC_F(CC_A(_, _), _, CC_C(_, _))) => 5 
  case CC_F(CC_A(_, CC_D(_, _)), _, CC_C(_, _)) => 6 
  case CC_F(CC_A(_, CC_E(_)), _, CC_C(_, _)) => 7 
  case CC_F(CC_A(_, CC_F(_, _, _)), _, CC_C(_, _)) => 8 
}
}