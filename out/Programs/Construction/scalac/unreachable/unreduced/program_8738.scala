package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_A[Byte, T_A[T_B, Int]]
case class CC_B(a: T_B, b: T_A[Byte, T_B], c: (T_B,CC_A)) extends T_A[Byte, T_A[T_B, Int]]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}