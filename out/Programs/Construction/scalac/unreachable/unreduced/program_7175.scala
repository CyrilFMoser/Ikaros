package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: Char) extends T_A[G, H]
case class CC_C[I](a: T_B[I, I]) extends T_B[Byte, I]
case class CC_D[J]() extends T_B[Byte, J]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}