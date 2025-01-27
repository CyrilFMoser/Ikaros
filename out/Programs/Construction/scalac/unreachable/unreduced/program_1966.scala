package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_B[E](a: T_A[E], b: Char, c: CC_A[Int]) extends T_A[E]
case class CC_C[F](a: CC_B[F]) extends T_B[CC_B[F], F]

val v_a: T_A[T_A[T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, CC_A(_))