package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_B[T_A[Byte, F], F], b: T_B[F, F], c: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: Boolean) extends T_B[G, Boolean]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
}
}