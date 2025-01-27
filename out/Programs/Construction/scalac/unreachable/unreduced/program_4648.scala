package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B(a: T_A[T_B, T_B], b: T_A[T_B, T_B], c: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_A[T_B, T_B]
case class CC_C(a: T_B, b: CC_B, c: CC_B) extends T_A[CC_B, T_B]
case class CC_D() extends T_B
case class CC_E[D](a: CC_A[D], b: T_A[D, T_B]) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}