package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: (T_B[Int, Boolean],CC_A[Char]), b: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[G](a: T_B[G, G], b: CC_B[G]) extends T_A[T_B[G, G], G]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_B((_,CC_A(_, _)), CC_B(_, CC_A(_, _))) => 2 
  case CC_B((_,CC_A(_, _)), CC_B(_, CC_B(_, _))) => 3 
  case CC_B((_,CC_A(_, _)), CC_B(_, CC_C(_, _))) => 4 
  case CC_B((_,CC_A(_, _)), CC_C(_, CC_B(_, _))) => 5 
  case CC_C(_, CC_B(_, _)) => 6 
}
}