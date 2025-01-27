package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[H, G](a: T_A[H, H], b: T_A[H, H]) extends T_A[G, H]

val v_a: CC_C[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)