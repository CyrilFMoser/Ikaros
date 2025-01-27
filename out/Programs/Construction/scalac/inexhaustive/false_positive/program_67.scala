package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B, b: T_A[T_A[T_B, Int], CC_A[Boolean]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(CC_A(_))