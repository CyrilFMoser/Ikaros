package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Boolean]
case class CC_B[F](a: F, b: F) extends T_A[F, Boolean]
case class CC_C[G](a: (CC_A[Boolean],CC_A[Byte]), b: CC_B[G]) extends T_B[T_A[G, G], G]
case class CC_D[H](a: Char, b: Boolean, c: T_B[H, H]) extends T_B[T_A[H, H], H]
case class CC_E[I]() extends T_B[T_A[I, I], I]

val v_a: T_B[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),CC_A()), CC_B(_, _)) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}