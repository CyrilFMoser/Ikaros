package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_C[I, H](a: T_A[I, I], b: T_A[I, Boolean]) extends T_A[H, I]

val v_a: CC_C[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_B (CC_A Wildcard Wildcard T_A) Wildcard Wildcard T_A)