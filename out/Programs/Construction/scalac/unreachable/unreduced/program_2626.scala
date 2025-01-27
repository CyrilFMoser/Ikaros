package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: CC_A, c: T_A[Byte]) extends T_A[T_B]
case class CC_C(a: Byte, b: Char) extends T_A[T_B]
case class CC_D(a: CC_C, b: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(0, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A()