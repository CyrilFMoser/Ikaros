package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B(a: T_A[(T_B,Boolean), T_B], b: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: Char, b: T_A[T_A[CC_B, T_B], T_A[Char, T_B]]) extends T_B
case class CC_D(a: T_A[CC_B, T_B], b: T_A[Int, Int], c: T_A[T_A[CC_C, T_B], Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C('x', _) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_C(_, _)