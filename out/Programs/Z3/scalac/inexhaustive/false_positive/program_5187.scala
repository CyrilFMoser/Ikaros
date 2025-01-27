package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_D[F, G](a: T_A[F], b: T_A[F]) extends T_B[F, G]

val v_a: CC_D[T_A[T_A[Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C T_A (Tuple Wildcard Wildcard) Wildcard T_A) Wildcard T_A)
//      Wildcard
//      T_A)