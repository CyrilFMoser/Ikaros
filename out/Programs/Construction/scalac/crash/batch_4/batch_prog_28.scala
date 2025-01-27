package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, D], b: T_A[E, E], c: T_A[D, D]) extends T_A[E, D]
case class CC_B[F]() extends T_B[F]
case class CC_C[G](a: CC_A[T_A[G, G], G], b: T_B[G], c: T_A[G, G]) extends T_B[G]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}