package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: CC_A) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: Int) extends T_B
case class CC_E(a: Boolean) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(), _) => 3 
  case CC_C() => 4 
}
}