package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[(T_B,CC_B)], b: T_A[T_B], c: CC_A) extends T_B
case class CC_D(a: Boolean, b: T_A[T_B], c: T_B) extends T_B
case class CC_E(a: T_A[T_B], b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), CC_A(_)) => 0 
  case CC_C(_, CC_B(), CC_A(_)) => 1 
  case CC_D(true, CC_A(_), _) => 2 
  case CC_D(true, CC_B(), _) => 3 
  case CC_D(false, CC_A(_), _) => 4 
  case CC_D(false, CC_B(), _) => 5 
  case CC_E(CC_A(_), CC_A(_)) => 6 
  case CC_E(CC_B(), CC_A(_)) => 7 
  case CC_E(CC_A(_), CC_B()) => 8 
  case CC_E(CC_B(), CC_B()) => 9 
}
}