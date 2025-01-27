package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Byte, (Boolean,(Boolean,Byte))], b: T_B[Int, T_B[Boolean, Int]], c: T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]) extends T_A[T_B[T_B[Byte, Int], T_B[Char, Boolean]], T_A[T_A[(Boolean,Boolean), Boolean], T_B[Boolean, Char]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_C[F]() extends T_A[Char, F]
case class CC_D[H, G](a: CC_B[H], b: T_A[T_B[G, G], G]) extends T_B[G, H]
case class CC_E[J, I](a: J, b: T_A[T_B[I, I], I]) extends T_B[J, I]
case class CC_F[K, L]() extends T_B[L, K]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_)) => 0 
  case CC_E(_, CC_B(_)) => 1 
  case CC_F() => 2 
}
}