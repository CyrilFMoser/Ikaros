package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[D]], D]
case class CC_B[E](a: T_B[E], b: T_A[E, E], c: T_A[E, E]) extends T_A[T_B[T_B[E]], E]
case class CC_C[F](a: Byte, b: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]
case class CC_E[H](a: ((Char,Boolean),CC_C[Boolean])) extends T_B[H]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E(((_,_),CC_C(_, _)))