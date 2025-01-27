package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B[E](a: E) extends T_A[E, T_B[T_B[E]]]
case class CC_C[F](a: Char, b: T_A[F, F], c: Boolean) extends T_A[F, T_B[T_B[F]]]

val v_a: T_A[Byte, T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}