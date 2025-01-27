package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, Boolean], c: (CC_A,T_A)) extends T_A
case class CC_C[C](a: CC_A, b: T_B[C, C]) extends T_B[T_B[T_B[CC_B, CC_B], (T_A,CC_B)], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (CC_A(),CC_A())) => 1 
  case CC_B(_, _, (CC_A(),CC_B(_, _, _))) => 2 
}
}