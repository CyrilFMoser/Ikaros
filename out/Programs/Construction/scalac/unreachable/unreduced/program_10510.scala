package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: (T_B[Byte, Char],T_A[Byte]), c: T_A[D]) extends T_A[D]
case class CC_B[E](a: Int, b: T_A[T_A[E]]) extends T_A[E]
case class CC_C[F](a: F, b: T_A[F]) extends T_B[F, T_A[F]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_B(_, CC_A(_, _, CC_B(_, _))) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}