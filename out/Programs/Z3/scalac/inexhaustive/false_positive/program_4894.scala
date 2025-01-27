package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F]() extends T_B[F, CC_A[F]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)