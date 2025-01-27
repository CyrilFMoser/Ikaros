package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: CC_A[D], b: (T_B,CC_A[T_B]), c: T_A[D, D]) extends T_A[T_B, D]

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))