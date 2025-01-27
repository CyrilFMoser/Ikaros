package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean) extends T_A[C, T_B]
case class CC_B[D](a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: D, c: CC_A[D]) extends T_A[Int, D]
case class CC_C[E]() extends T_A[Int, E]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[Int, CC_D], Byte]) extends T_B
case class CC_F(a: T_A[Byte, CC_B[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(_)