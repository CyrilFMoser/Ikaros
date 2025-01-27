package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Char]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Char]], D]
case class CC_C(a: Int) extends T_B
case class CC_D(a: T_A[Boolean, T_B]) extends T_B
case class CC_E(a: CC_D, b: Char, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E(_, _, _)