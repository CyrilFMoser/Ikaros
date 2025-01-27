package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[Byte]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte]]]
case class CC_B(a: Int, b: T_B[((Char,Byte),CC_A), Char]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte]]]
case class CC_C[D, E]() extends T_B[E, D]
case class CC_D[F, G](a: G, b: G) extends T_B[F, G]
case class CC_E[H](a: T_B[H, H], b: T_B[H, T_B[H, H]], c: H) extends T_B[H, CC_D[T_B[(Byte,Int), CC_B], Int]]

val v_a: T_A[T_B[T_B[Char, Byte], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}