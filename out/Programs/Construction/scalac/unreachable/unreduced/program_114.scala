package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]
case class CC_D[G](a: T_A[G, T_A[G, G]]) extends T_B[G]
case class CC_E[H](a: T_A[T_B[H], T_A[T_B[H], T_B[H]]]) extends T_B[H]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_C()) => 1 
}
}
// This is not matched: CC_D(CC_B(_))