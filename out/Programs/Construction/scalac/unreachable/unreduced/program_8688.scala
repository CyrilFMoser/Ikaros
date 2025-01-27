package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: T_A[T_B, Boolean], b: T_A[T_B, T_A[T_B, Int]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(12, _, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_A(_, _, _))