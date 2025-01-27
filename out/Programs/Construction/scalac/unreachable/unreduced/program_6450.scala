package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: Byte, b: CC_A, c: T_B) extends T_B
case class CC_E(a: T_A[CC_B], b: T_A[T_B], c: CC_A) extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0, CC_A(_), _) => 0 
  case CC_D(_, CC_A(_), _) => 1 
  case CC_E(_, _, _) => 2 
  case CC_F(CC_D(0, _, CC_D(_, _, _))) => 3 
  case CC_F(CC_D(_, _, CC_D(_, _, _))) => 4 
  case CC_F(CC_D(0, _, CC_E(_, _, _))) => 5 
  case CC_F(CC_D(_, _, CC_E(_, _, _))) => 6 
  case CC_F(CC_D(0, _, CC_F(_))) => 7 
  case CC_F(CC_D(_, _, CC_F(_))) => 8 
  case CC_F(CC_E(_, CC_A(_), _)) => 9 
  case CC_F(CC_E(_, CC_B(), _)) => 10 
  case CC_F(CC_E(_, CC_C(), _)) => 11 
  case CC_F(CC_F(CC_D(_, _, _))) => 12 
  case CC_F(CC_F(CC_E(_, _, _))) => 13 
  case CC_F(CC_F(CC_F(_))) => 14 
}
}