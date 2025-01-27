package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: T_B[D], c: (T_A[Boolean, Boolean],Byte)) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: Boolean) extends T_A[T_B[E], E]
case class CC_C[F](a: Char, b: T_B[F], c: T_A[T_B[F], F]) extends T_A[T_B[F], F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 1 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 2 
  case CC_B(CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), _), _)