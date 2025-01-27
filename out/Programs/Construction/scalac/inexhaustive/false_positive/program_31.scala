package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_F(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_F(CC_A()), _) => 1 
}
}
// This is not matched: CC_D(_, _, _)