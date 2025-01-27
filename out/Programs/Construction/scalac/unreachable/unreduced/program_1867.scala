package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[E, E], E]
case class CC_B[F](a: F, b: Boolean) extends T_B[F, T_A[T_B[F, F], F]]
case class CC_C[G](a: (T_B[(Int,Boolean), Boolean],T_A[Int, (Int,Int)]), b: CC_B[G], c: T_A[G, G]) extends T_B[G, T_A[T_B[G, G], G]]

val v_a: T_B[Byte, T_A[T_B[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}