package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[Boolean, Boolean], b: T_A[D, T_A[T_B, D]], c: T_A[D, Boolean]) extends T_A[Boolean, Boolean]
case class CC_C[E](a: E, b: CC_A[E]) extends T_A[E, Boolean]
case class CC_D() extends T_B

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()