package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_B[T_B[Char, Int], T_A[Int, Byte]]]
case class CC_B[F]() extends T_A[F, T_B[T_B[Char, Int], T_A[Int, Byte]]]
case class CC_C[G]() extends T_A[G, T_B[T_B[Char, Int], T_A[Int, Byte]]]
case class CC_D[I, H]() extends T_B[H, I]
case class CC_E[K, J]() extends T_B[J, K]
case class CC_F[L](a: Boolean) extends T_B[CC_A[CC_D[Byte, Byte]], L]

val v_a: T_A[Boolean, T_B[T_B[Char, Int], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()