package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D) extends T_A[D, E]
case class CC_B() extends T_B[CC_A[Boolean, Int]]
case class CC_C[F](a: T_B[F], b: T_B[F], c: T_A[F, F]) extends T_B[F]

val v_a: CC_C[T_B[CC_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(CC_B())) => 0 
}
}
// This is not matched: (CC_B T_B (T_A T_B))
// Mutation information: 
// Deleted Pattern CC_A(0, _) at position 2