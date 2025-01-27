package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char]) extends T_A[D, Char]
case class CC_C[E](a: E, b: Int, c: T_B) extends T_A[E, Char]
case class CC_D(a: T_A[Boolean, T_A[T_B, Char]], b: T_A[CC_C[T_B], Char]) extends T_B
case class CC_E(a: T_A[T_A[CC_D, CC_D], Char]) extends T_B
case class CC_F(a: T_A[T_B, Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_D(_, _))) => 0 
  case CC_D(_, CC_A(CC_E(_))) => 1 
  case CC_D(_, CC_A(CC_F(_))) => 2 
  case CC_D(_, CC_B(CC_A(_))) => 3 
  case CC_D(_, CC_B(CC_B(_))) => 4 
  case CC_D(_, CC_B(CC_C(_, _, _))) => 5 
  case CC_E(CC_A(CC_D(_, _))) => 6 
  case CC_E(CC_A(CC_E(_))) => 7 
  case CC_E(CC_A(CC_F(_))) => 8 
  case CC_E(CC_B(CC_A(_))) => 9 
  case CC_E(CC_B(CC_B(_))) => 10 
  case CC_E(CC_B(CC_C(_, _, _))) => 11 
  case CC_E(CC_C(_, _, CC_D(_, _))) => 12 
  case CC_E(CC_C(_, _, CC_E(_))) => 13 
  case CC_E(CC_C(_, _, CC_F(_))) => 14 
  case CC_F(CC_A(CC_D(_, _))) => 15 
  case CC_F(CC_A(CC_E(_))) => 16 
  case CC_F(CC_A(CC_F(_))) => 17 
  case CC_F(CC_B(_)) => 18 
  case CC_F(CC_C(_, _, _)) => 19 
}
}
// This is not matched: CC_D(_, CC_C(_, _, _))