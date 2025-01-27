package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_B[T_A[E], E], c: T_A[E]) extends T_B[T_A[E], E]
case class CC_C[F](a: T_B[F, F]) extends T_B[T_A[F], F]
case class CC_D[G](a: T_B[G, G], b: T_A[G], c: T_A[G]) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), CC_A()) => 0 
  case CC_B(_, CC_C(_), CC_A()) => 1 
  case CC_B(_, CC_D(_, CC_A(), CC_A()), CC_A()) => 2 
  case CC_C(_) => 3 
  case CC_D(_, CC_A(), _) => 4 
}
}