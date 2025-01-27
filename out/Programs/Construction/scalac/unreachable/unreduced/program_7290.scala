package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean, c: T_B) extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B], b: T_B) extends T_B
case class CC_E[C](a: (Int,T_A[T_B, CC_A]), b: CC_B, c: Char) extends T_B
case class CC_F(a: CC_E[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_D(_, _)) => 0 
  case CC_D(CC_A(_, _, _), CC_E((_,_), CC_B(_, _), _)) => 1 
  case CC_D(CC_A(_, _, _), CC_F(CC_E(_, _, _))) => 2 
  case CC_D(CC_B(_, _), CC_D(_, _)) => 3 
  case CC_D(CC_B(_, _), CC_E((_,_), CC_B(_, _), _)) => 4 
  case CC_D(CC_B(_, _), CC_F(CC_E(_, _, _))) => 5 
  case CC_D(CC_C(CC_A(_, _, _)), CC_D(_, _)) => 6 
  case CC_D(CC_C(CC_A(_, _, _)), CC_E((_,_), CC_B(_, _), _)) => 7 
  case CC_D(CC_C(CC_A(_, _, _)), CC_F(CC_E(_, _, _))) => 8 
  case CC_D(CC_C(CC_B(_, _)), CC_D(_, _)) => 9 
  case CC_D(CC_C(CC_B(_, _)), CC_E((_,_), CC_B(_, _), _)) => 10 
  case CC_D(CC_C(CC_B(_, _)), CC_F(CC_E(_, _, _))) => 11 
  case CC_D(CC_C(CC_C(_)), CC_D(_, _)) => 12 
  case CC_D(CC_C(CC_C(_)), CC_E((_,_), CC_B(_, _), _)) => 13 
  case CC_D(CC_C(CC_C(_)), CC_F(CC_E(_, _, _))) => 14 
  case CC_E(_, _, _) => 15 
  case CC_F(CC_E(_, CC_B(_, _), _)) => 16 
}
}