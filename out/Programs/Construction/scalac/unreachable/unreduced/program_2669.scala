package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F, G](a: T_B[F], b: T_A[F, T_A[F, F]], c: T_A[G, T_A[G, G]]) extends T_B[F]
case class CC_D[H]() extends T_B[H]
case class CC_E[I]() extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C(_, CC_B(_), _)