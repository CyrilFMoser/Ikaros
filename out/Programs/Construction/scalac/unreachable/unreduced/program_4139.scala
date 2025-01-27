package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_A[D, D]]) extends T_A[T_B[(Char,Char)], D]
case class CC_B[E](a: Boolean, b: E, c: E) extends T_A[T_B[(Char,Char)], E]
case class CC_C[F](a: T_B[F], b: T_A[F, F]) extends T_A[T_B[(Char,Char)], F]

val v_a: T_A[T_B[(Char,Char)], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)