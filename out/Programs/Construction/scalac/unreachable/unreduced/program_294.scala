package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[T_B, C]
case class CC_B[D, E](a: D, b: (Int,CC_A[T_B])) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_C(CC_B(_, _)) => 1 
  case CC_D(CC_A(_, _)) => 2 
  case CC_D(CC_B(_, _)) => 3 
}
}