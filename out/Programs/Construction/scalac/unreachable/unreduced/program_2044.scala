package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: T_B[Boolean]) extends T_A
case class CC_C(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_D(a: T_B[Int], b: Boolean, c: CC_A) extends T_B[CC_A]
case class CC_E(a: CC_C, b: CC_A, c: Byte) extends T_B[CC_A]
case class CC_F(a: CC_B, b: T_B[Int], c: CC_C) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B(_), _) => 3 
  case CC_A(CC_C(CC_A(_, _), _), _) => 4 
  case CC_A(CC_C(CC_B(_), _), _) => 5 
  case CC_A(CC_C(CC_C(_, _), _), _) => 6 
  case CC_B(_) => 7 
  case CC_C(CC_A(CC_A(_, _), _), CC_D(_, true, CC_A(_, _))) => 8 
  case CC_C(CC_A(CC_B(_), _), CC_D(_, true, CC_A(_, _))) => 9 
  case CC_C(CC_A(CC_C(_, _), _), CC_D(_, true, CC_A(_, _))) => 10 
  case CC_C(CC_B(_), CC_D(_, true, CC_A(_, _))) => 11 
  case CC_C(CC_C(_, _), CC_D(_, true, CC_A(_, _))) => 12 
  case CC_C(CC_A(CC_A(_, _), _), CC_D(_, false, CC_A(_, _))) => 13 
  case CC_C(CC_A(CC_B(_), _), CC_D(_, false, CC_A(_, _))) => 14 
  case CC_C(CC_A(CC_C(_, _), _), CC_D(_, false, CC_A(_, _))) => 15 
  case CC_C(CC_B(_), CC_D(_, false, CC_A(_, _))) => 16 
  case CC_C(CC_C(_, _), CC_D(_, false, CC_A(_, _))) => 17 
  case CC_C(CC_A(CC_A(_, _), _), CC_E(CC_C(_, _), _, _)) => 18 
  case CC_C(CC_A(CC_B(_), _), CC_E(CC_C(_, _), _, _)) => 19 
  case CC_C(CC_A(CC_C(_, _), _), CC_E(CC_C(_, _), _, _)) => 20 
  case CC_C(CC_B(_), CC_E(CC_C(_, _), _, _)) => 21 
  case CC_C(CC_C(_, _), CC_E(CC_C(_, _), _, _)) => 22 
  case CC_C(CC_A(CC_A(_, _), _), CC_F(_, _, CC_C(_, _))) => 23 
  case CC_C(CC_A(CC_B(_), _), CC_F(_, _, CC_C(_, _))) => 24 
  case CC_C(CC_A(CC_C(_, _), _), CC_F(_, _, CC_C(_, _))) => 25 
  case CC_C(CC_B(_), CC_F(_, _, CC_C(_, _))) => 26 
  case CC_C(CC_C(_, _), CC_F(_, _, CC_C(_, _))) => 27 
}
}