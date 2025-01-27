package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: (CC_A,T_B)) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: Int, b: T_A[(T_B,T_B)]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_D(_, _))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B((CC_A(),CC_E()))