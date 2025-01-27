package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_B[F], b: Char) extends T_B[F]
case class CC_D[G](a: CC_A[G], b: T_B[G], c: T_A[T_A[G, G], G]) extends T_B[G]
case class CC_E[H](a: Char, b: (T_A[Boolean, Boolean],T_B[Byte]), c: CC_A[H]) extends T_B[H]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}