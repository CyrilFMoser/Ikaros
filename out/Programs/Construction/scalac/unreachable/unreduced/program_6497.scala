package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Char, c: (Char,(Byte,Char))) extends T_A[T_A[E, E], E]
case class CC_B[F](a: Int, b: Byte) extends T_A[T_A[F, F], F]
case class CC_C[G]() extends T_A[T_A[G, G], G]
case class CC_D[H](a: H, b: T_A[T_A[H, H], H]) extends T_B[H, CC_C[H]]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,(_,_))) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()