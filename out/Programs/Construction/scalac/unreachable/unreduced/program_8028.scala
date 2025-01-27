package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[D, T_A[T_B, D]]

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(), _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _), _), _)