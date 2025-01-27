package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]]]
case class CC_B[F, G](a: G, b: T_A[F, F]) extends T_A[F, T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]]]
case class CC_C[H](a: T_B[H, H]) extends T_A[H, CC_B[H, H]]
case class CC_D[I](a: T_A[I, I], b: I, c: Int) extends T_B[I, CC_B[I, I]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}