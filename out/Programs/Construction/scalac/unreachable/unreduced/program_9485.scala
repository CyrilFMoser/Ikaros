package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Byte, c: T_A[C, C]) extends T_A[T_A[T_B, T_A[T_B, Byte]], C]
case class CC_B(a: T_B, b: CC_A[T_B]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_B(CC_C(), CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(CC_B(CC_C(), CC_A(_, _, _)), CC_A(_, _, _))