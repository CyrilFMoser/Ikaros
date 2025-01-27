package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D, E]() extends T_A[T_B, D]
case class CC_C[F]() extends T_A[T_B, F]
case class CC_D(a: CC_C[CC_A[(Char,Boolean)]], b: Boolean) extends T_B
case class CC_E(a: CC_D, b: T_A[T_A[T_B, CC_D], T_B]) extends T_B
case class CC_F(a: T_A[T_B, T_A[T_B, T_B]], b: Boolean, c: T_A[T_B, CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_D(CC_C(), _), _) => 0 
  case CC_F(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, _)