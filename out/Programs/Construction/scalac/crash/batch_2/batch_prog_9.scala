package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: Byte, c: D) extends T_A[C, D]
case class CC_B[E]() extends T_A[Char, E]
case class CC_C[F](a: CC_A[F, F], b: F) extends T_A[Char, F]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}