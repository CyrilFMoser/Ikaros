package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, Int]
case class CC_C(a: Byte, b: T_A[T_B, Int], c: (CC_B,CC_A[(Boolean,Char)])) extends T_A[T_B, Int]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[CC_C, Byte], b: CC_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}