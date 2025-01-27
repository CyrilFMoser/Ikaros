package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_B[D]]]
case class CC_B[E](a: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: CC_B[T_B[F]]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}