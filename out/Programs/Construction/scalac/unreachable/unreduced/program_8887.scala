package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,T_A[Int, Int]), b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[H, G](a: T_B[H, T_B[G, Int]], b: T_A[T_B[G, G], G], c: Char) extends T_B[H, G]
case class CC_D[J, I]() extends T_B[J, I]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _), _) => 0 
  case CC_C(_, CC_B(CC_A(_, _)), _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_C(_, CC_B(CC_B(_)), _)