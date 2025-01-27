package Program_17 

object Test {
sealed trait T_B[C]
case class CC_C[E](a: T_B[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_D()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_)) at position 0