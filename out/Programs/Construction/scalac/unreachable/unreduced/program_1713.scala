package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], C]
case class CC_B[D]() extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], D]
case class CC_C[E](a: E, b: T_A[E, E]) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], E]
case class CC_D(a: Int) extends T_B
case class CC_E(a: CC_C[CC_C[T_B]], b: CC_B[T_A[CC_D, Int]]) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()