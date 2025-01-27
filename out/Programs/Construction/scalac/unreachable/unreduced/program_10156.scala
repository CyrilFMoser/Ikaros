package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_B(_), _)) => 0 
  case CC_C(CC_B(CC_A(_, _, _))) => 1 
  case CC_C(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_C(CC_A(_, CC_A(_, _, _), _))