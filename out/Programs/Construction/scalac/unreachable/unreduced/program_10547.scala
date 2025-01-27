package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: CC_A[F]) extends T_B[F, T_B[F, T_B[Char, F]]]
case class CC_C[G, H](a: T_B[H, G]) extends T_B[G, T_B[G, T_B[Char, G]]]

val v_a: T_B[Char, T_B[Char, T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_) => 1 
}
}