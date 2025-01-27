package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Char, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_B]
case class CC_C() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(CC_B(CC_A(_, _, _), _), _, _)