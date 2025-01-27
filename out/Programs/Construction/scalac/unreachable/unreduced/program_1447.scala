package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_B) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, T_B], b: T_A[T_B, T_A[CC_B, Int]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_B(_)