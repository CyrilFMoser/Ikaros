package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_A[E, (Char,(Boolean,Int))], c: T_B[E, E]) extends T_A[F, E]
case class CC_B[G](a: Char, b: T_A[G, G], c: T_A[G, G]) extends T_B[G, T_A[G, G]]
case class CC_C[H](a: CC_B[H], b: T_A[H, T_B[H, H]], c: CC_B[H]) extends T_B[H, T_A[H, H]]
case class CC_D[I]() extends T_B[I, T_A[I, I]]

val v_a: T_B[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}