package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[Char])) extends T_A
case class CC_B(a: T_B[T_A], b: CC_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: CC_B) extends T_B[CC_C]
case class CC_E(a: T_B[CC_C], b: T_A) extends T_B[CC_C]
case class CC_F[B](a: B, b: T_B[B]) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), _) => 0 
  case CC_E(CC_D(_, _), CC_A(_)) => 1 
  case CC_E(CC_D(_, _), CC_B(_, CC_A(_), CC_A(_))) => 2 
  case CC_E(CC_D(_, _), CC_B(_, CC_A(_), CC_B(_, _, _))) => 3 
  case CC_E(CC_D(_, _), CC_B(_, CC_A(_), CC_C())) => 4 
  case CC_E(CC_D(_, _), CC_C()) => 5 
  case CC_E(CC_E(_, CC_A(_)), CC_A(_)) => 6 
  case CC_E(CC_E(_, CC_A(_)), CC_B(_, CC_A(_), CC_A(_))) => 7 
  case CC_E(CC_E(_, CC_A(_)), CC_B(_, CC_A(_), CC_B(_, _, _))) => 8 
  case CC_E(CC_E(_, CC_A(_)), CC_B(_, CC_A(_), CC_C())) => 9 
  case CC_E(CC_E(_, CC_A(_)), CC_C()) => 10 
  case CC_E(CC_E(_, CC_B(_, _, _)), CC_A(_)) => 11 
  case CC_E(CC_E(_, CC_B(_, _, _)), CC_B(_, CC_A(_), CC_A(_))) => 12 
  case CC_E(CC_E(_, CC_B(_, _, _)), CC_B(_, CC_A(_), CC_B(_, _, _))) => 13 
  case CC_E(CC_E(_, CC_B(_, _, _)), CC_B(_, CC_A(_), CC_C())) => 14 
  case CC_E(CC_E(_, CC_B(_, _, _)), CC_C()) => 15 
  case CC_E(CC_E(_, CC_C()), CC_A(_)) => 16 
  case CC_E(CC_E(_, CC_C()), CC_B(_, CC_A(_), CC_A(_))) => 17 
  case CC_E(CC_E(_, CC_C()), CC_B(_, CC_A(_), CC_B(_, _, _))) => 18 
  case CC_E(CC_E(_, CC_C()), CC_B(_, CC_A(_), CC_C())) => 19 
  case CC_E(CC_E(_, CC_C()), CC_C()) => 20 
  case CC_E(CC_F(_, _), CC_A(_)) => 21 
  case CC_E(CC_F(_, _), CC_B(_, CC_A(_), CC_A(_))) => 22 
  case CC_E(CC_F(_, _), CC_B(_, CC_A(_), CC_B(_, _, _))) => 23 
  case CC_E(CC_F(_, _), CC_B(_, CC_A(_), CC_C())) => 24 
  case CC_E(CC_F(_, _), CC_C()) => 25 
  case CC_F(_, _) => 26 
}
}