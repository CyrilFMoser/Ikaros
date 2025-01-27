package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: T_B[T_A[E], E]) extends T_B[T_A[E], E]
case class CC_C[F](a: T_B[CC_B[F], F]) extends T_B[T_A[F], F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B('x', CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 1 
  case CC_B(_, CC_B('x', CC_C(_))) => 2 
  case CC_B(_, CC_B(_, CC_C(_))) => 3 
  case CC_B(_, CC_C(_)) => 4 
}
}