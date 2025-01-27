package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: T_A[F, F], c: T_A[E, E]) extends T_A[F, E]
case class CC_B[G, H](a: (T_A[Char, Int],T_A[Int, Boolean]), b: T_A[G, H]) extends T_A[G, CC_A[G, G]]

val v_a: T_A[Char, CC_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: CC_B((CC_A(_, _, _),CC_A(_, _, _)), _)