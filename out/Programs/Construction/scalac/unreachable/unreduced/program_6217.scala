package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_D(a: CC_B, b: T_B[CC_A], c: T_B[CC_A]) extends T_B[CC_A]
case class CC_E(a: T_A) extends T_B[CC_A]
case class CC_F() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 0 
  case CC_D(_, CC_D(_, CC_E(_), _), _) => 1 
  case CC_D(_, CC_D(_, CC_F(), _), _) => 2 
  case CC_D(_, CC_E(CC_A(_, _)), _) => 3 
  case CC_D(_, CC_E(CC_B()), _) => 4 
  case CC_D(_, CC_E(CC_C(_, _)), _) => 5 
  case CC_D(_, CC_F(), _) => 6 
  case CC_E(CC_A(_, _)) => 7 
  case CC_E(CC_B()) => 8 
  case CC_E(CC_C(CC_A(_, _), CC_D(_, _, _))) => 9 
  case CC_E(CC_C(CC_B(), CC_D(_, _, _))) => 10 
  case CC_E(CC_C(CC_C(_, _), CC_D(_, _, _))) => 11 
  case CC_E(CC_C(CC_A(_, _), CC_E(_))) => 12 
  case CC_E(CC_C(CC_B(), CC_E(_))) => 13 
  case CC_E(CC_C(CC_C(_, _), CC_E(_))) => 14 
  case CC_E(CC_C(CC_A(_, _), CC_F())) => 15 
  case CC_E(CC_C(CC_B(), CC_F())) => 16 
  case CC_E(CC_C(CC_C(_, _), CC_F())) => 17 
  case CC_F() => 18 
}
}