package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_A[T_A[Char, Int], T_B[Char]], D]
case class CC_B[E](a: E) extends T_A[T_A[T_A[Char, Int], T_B[Char]], E]
case class CC_C[F](a: T_A[F, F], b: CC_A[F], c: CC_A[F]) extends T_A[T_A[T_A[Char, Int], T_B[Char]], F]

val v_a: T_A[T_A[T_A[Char, Int], T_B[Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_A(_), _) => 1 
}
}
// This is not matched: CC_B(_)