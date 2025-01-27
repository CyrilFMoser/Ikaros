package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, T_B[E, E]], E]
case class CC_B[F](a: Char, b: F, c: T_A[F, F]) extends T_A[T_B[F, T_B[F, F]], F]
case class CC_C[G, H](a: (Byte,T_B[Byte, Char])) extends T_B[G, H]
case class CC_D[I, J](a: CC_C[I, I], b: J, c: J) extends T_B[Int, I]
case class CC_E[K](a: T_A[K, K], b: Byte, c: CC_B[K]) extends T_B[Int, K]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_C(_))) => 0 
  case CC_D(CC_C(_), _, _) => 1 
  case CC_E(_, _, CC_B(_, _, _)) => 2 
}
}