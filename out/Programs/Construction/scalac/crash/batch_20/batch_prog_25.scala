package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: Boolean, b: (T_A[Byte, Boolean],T_B[Byte, Byte])) extends T_A[F, CC_A[F]]
case class CC_C[G, H]() extends T_A[G, H]
case class CC_D[I](a: CC_C[I, I], b: (T_A[Int, Boolean],CC_A[Int]), c: CC_A[I]) extends T_B[I, T_A[T_A[Int, Int], CC_A[T_A[Int, Int]]]]
case class CC_E[J](a: J) extends T_B[J, T_A[T_A[Int, Int], CC_A[T_A[Int, Int]]]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}