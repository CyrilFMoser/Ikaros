package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F], b: T_B[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: (Int,T_A[Char, Byte]), b: Boolean, c: G) extends T_A[H, G]
case class CC_C[I](a: Boolean, b: T_A[I, T_A[I, I]], c: I) extends T_A[(CC_B[Byte, Char],T_A[Int, Byte]), I]
case class CC_D[J]() extends T_B[J, CC_B[J, CC_B[J, J]]]
case class CC_E[K]() extends T_B[K, CC_B[K, CC_B[K, K]]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}