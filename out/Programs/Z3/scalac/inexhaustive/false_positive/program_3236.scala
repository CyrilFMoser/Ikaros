package Program_15 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[F, E](a: E) extends T_A[E, F]
case class CC_C[G, H](a: CC_B[G, G], b: CC_A[G, H], c: T_A[H, H]) extends T_A[T_A[G, T_B], G]
case class CC_D(a: T_A[T_B, Int], b: CC_B[T_B, Boolean]) extends T_B
case class CC_E(a: CC_A[CC_D, CC_D], b: T_A[CC_D, CC_D], c: CC_C[T_B, T_B]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_B(_), CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_E Wildcard
//      (CC_A (CC_D Wildcard Wildcard Wildcard)
//            (CC_D (T_A T_B T_B) T_B T_B)
//            (T_A (CC_D (T_A T_B T_B) T_B T_B) (CC_D Wildcard Wildcard Wildcard)))
//      Wildcard
//      T_B)
// This is not matched: Pattern match is empty without constants