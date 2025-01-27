package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B]) extends T_A[(T_A[T_B, T_B],T_A[T_B, Char]), C]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, D]) extends T_A[(T_A[T_B, T_B],T_A[T_B, Char]), D]
case class CC_C[E]() extends T_A[(T_A[T_B, T_B],T_A[T_B, Char]), E]
case class CC_D[F]() extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_D[CC_B[Byte]]) extends T_B

val v_a: T_A[(T_A[T_B, T_B],T_A[T_B, Char]), Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)