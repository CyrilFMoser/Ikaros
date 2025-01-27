package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_B], b: T_A, c: T_B[T_A]) extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_E[B](a: CC_C) extends T_B[(Byte,(CC_B,(Int,Int)))]
case class CC_F(a: Char, b: Int, c: CC_E[CC_B]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, CC_A(_, _), _)) => 5 
  case CC_B(CC_C(_, CC_C(_, _, _), _)) => 6 
  case CC_C(_, CC_A(_, _), _) => 7 
  case CC_C(_, CC_B(CC_A(_, _)), _) => 8 
  case CC_C(_, CC_B(CC_B(_)), _) => 9 
  case CC_C(_, CC_B(CC_C(_, _, _)), _) => 10 
  case CC_C(_, CC_C(_, CC_A(_, _), _), _) => 11 
  case CC_C(_, CC_C(_, CC_B(_), _), _) => 12 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 13 
}
}
// This is not matched: CC_B(CC_C(_, CC_B(_), _))