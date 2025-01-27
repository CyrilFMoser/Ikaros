package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: T_B[E, E], c: T_A[E, E]) extends T_A[(T_B[Boolean, Int],T_A[Int, Int]), E]
case class CC_B(a: T_B[(Char,Byte), Char]) extends T_A[(T_B[Boolean, Int],T_A[Int, Int]), T_B[T_A[Byte, Int], (Boolean,Char)]]
case class CC_C[F](a: T_A[F, T_B[F, F]], b: F) extends T_A[F, T_B[F, F]]
case class CC_D[G](a: G) extends T_B[G, CC_C[G]]
case class CC_E[H](a: T_A[H, H]) extends T_B[H, CC_C[H]]

val v_a: T_B[Byte, CC_C[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_) => 1 
}
}