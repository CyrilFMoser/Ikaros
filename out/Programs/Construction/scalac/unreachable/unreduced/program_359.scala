package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[Boolean, F]) extends T_B[(CC_A[Char],T_B[Byte, Int]), F]
case class CC_C[G](a: G) extends T_B[(CC_A[Char],T_B[Byte, Int]), G]
case class CC_D[H](a: T_A[T_B[H, H], H]) extends T_B[(CC_A[Char],T_B[Byte, Int]), H]

val v_a: T_B[(CC_A[Char],T_B[Byte, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_A()) => 2 
}
}