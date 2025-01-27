package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F]) extends T_A[F, E]
case class CC_B[G](a: Char, b: CC_A[G, G], c: Char) extends T_A[G, T_A[G, G]]
case class CC_C[H](a: H, b: H) extends T_A[H, T_A[H, H]]
case class CC_D[I](a: T_A[T_A[Int, Int], T_A[I, I]]) extends T_B[I, CC_A[T_B[Boolean, Byte], T_A[Char, Char]]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C(_, _) => 2 
}
}