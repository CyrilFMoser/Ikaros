package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: Boolean) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D(a: Byte, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B(true)) => 1 
  case CC_C(CC_B(false)) => 2 
  case CC_D(_, CC_A(_)) => 3 
}
}