package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: (T_A[Byte, Char],CC_A[Int]), b: T_A[T_B[T_B[E]], T_B[E]]) extends T_A[T_B[E], E]
case class CC_C[F](a: CC_B[F], b: T_A[F, Int], c: CC_B[F]) extends T_B[F]

val v_a: T_A[T_B[Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, CC_A(_))) => 2 
  case CC_A(CC_B(_, CC_B(_, _))) => 3 
  case CC_B((_,CC_A(_)), _) => 4 
}
}