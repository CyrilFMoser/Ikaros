package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B() extends T_A[T_A[T_B[CC_A[Int], T_A[Int, Char]], T_B[CC_A[Int], T_A[Int, Char]]], T_B[CC_A[Int], T_A[Int, Char]]]
case class CC_C[F](a: Int, b: CC_A[F]) extends T_B[T_B[F, F], F]
case class CC_D[G](a: T_B[T_B[G, G], G], b: T_B[G, G], c: T_B[T_B[G, G], G]) extends T_B[T_B[G, G], G]

val v_a: T_A[T_A[T_B[CC_A[Int], T_A[Int, Char]], T_B[CC_A[Int], T_A[Int, Char]]], T_B[CC_A[Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B())) => 1 
  case CC_A(_, _, CC_B()) => 2 
  case CC_B() => 3 
}
}