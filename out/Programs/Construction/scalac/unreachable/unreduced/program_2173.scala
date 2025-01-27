package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: T_B, b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_D(a: CC_B, b: T_A[CC_A]) extends T_B
case class CC_E(a: Byte) extends T_B
case class CC_F(a: T_B, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_D(_, _), CC_A(0)) => 2 
  case CC_F(CC_D(_, _), CC_A(_)) => 3 
  case CC_F(CC_E(_), CC_A(0)) => 4 
  case CC_F(CC_F(CC_D(_, _), _), CC_A(0)) => 5 
  case CC_F(CC_F(CC_D(_, _), _), CC_A(_)) => 6 
  case CC_F(CC_F(CC_E(_), _), CC_A(0)) => 7 
  case CC_F(CC_F(CC_E(_), _), CC_A(_)) => 8 
  case CC_F(CC_F(CC_F(_, _), _), CC_A(0)) => 9 
  case CC_F(CC_F(CC_F(_, _), _), CC_A(_)) => 10 
}
}
// This is not matched: CC_F(CC_E(_), CC_A(_))