package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, T_B[E, E]]]
case class CC_B[F](a: CC_A[F], b: T_A[F, F]) extends T_A[F, T_A[F, T_B[F, F]]]

val v_a: T_A[Boolean, T_A[Boolean, T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}