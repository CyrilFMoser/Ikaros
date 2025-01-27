package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[D]) extends T_A[T_A[T_B[Char], T_B[Char]], D]
case class CC_B[E]() extends T_A[T_A[T_B[Char], T_B[Char]], E]
case class CC_C[F](a: CC_A[(Byte,Int)]) extends T_B[F]
case class CC_D[G](a: CC_A[G], b: Char, c: T_B[G]) extends T_B[G]
case class CC_E[H](a: Boolean) extends T_B[H]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
}
}