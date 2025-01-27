package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: T_B[D]) extends T_A[D, T_B[T_A[D, D]]]
case class CC_B[E](a: CC_A[T_B[E]]) extends T_A[E, T_B[T_A[E, E]]]
case class CC_C[F, G](a: T_A[G, F]) extends T_A[G, F]
case class CC_D[H](a: Char, b: CC_B[H]) extends T_B[CC_A[CC_A[Int]]]

val v_a: T_A[Char, T_B[T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}