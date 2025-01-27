package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, Byte]
case class CC_B[G, F](a: T_A[F, Byte], b: T_A[G, G], c: T_A[F, Byte]) extends T_B[G, F]
case class CC_C[H]() extends T_B[H, CC_A[H]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}