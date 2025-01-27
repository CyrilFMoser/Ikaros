package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B, b: T_A[T_A[T_B, T_B], T_B], c: CC_A[(T_B,T_B)]) extends T_B
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}