package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],T_A[Boolean])) extends T_B[T_A[E], E]
case class CC_C[F](a: T_A[F], b: CC_A[F]) extends T_B[T_A[F], F]
case class CC_D[G](a: G) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_D(_) => 2 
}
}