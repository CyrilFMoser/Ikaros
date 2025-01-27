package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G]() extends T_A[F]
case class CC_D[H](a: T_B[H, H], b: CC_A[H]) extends T_B[CC_A[T_A[Boolean]], H]
case class CC_E[I](a: T_A[I], b: Char) extends T_B[CC_A[T_A[Boolean]], I]

val v_a: T_B[CC_A[T_A[Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
  case CC_E(_, _) => 1 
}
}