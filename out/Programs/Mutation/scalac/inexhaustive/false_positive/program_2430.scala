package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_C[E](a: T_B[E], b: T_A[E, E], c: T_B[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_)) at position 0