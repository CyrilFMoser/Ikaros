package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B(a: Byte) extends T_A[T_A[T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]], T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]], T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]]
case class CC_C[F, G](a: T_B[F, G], b: Int, c: Char) extends T_B[F, G]
case class CC_D[I, H](a: CC_A[H], b: T_A[I, T_B[H, I]]) extends T_B[I, H]
case class CC_E[K, J, L](a: CC_B, b: T_A[J, K]) extends T_B[J, K]

val v_a: T_B[T_A[T_A[T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]], T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]], T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Int]], T_A[Boolean, Int]]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, 'x') => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _) => 2 
  case CC_E(CC_B(_), _) => 3 
}
}