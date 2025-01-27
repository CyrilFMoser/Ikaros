package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B, T_B]), b: Byte) extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_B, c: T_A[Byte, (T_B,CC_A)]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), CC_C(), _), _) => 1 
  case CC_B(CC_A(_, _), CC_C(), _) => 2 
  case CC_C() => 3 
}
}