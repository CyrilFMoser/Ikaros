package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[F, E]
case class CC_B[H](a: T_A[H, H], b: CC_A[H, H, H]) extends T_A[H, T_A[H, H]]
case class CC_C[I](a: I) extends T_A[T_A[I, I], I]
case class CC_D[J]() extends T_B[J, T_A[J, J]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Int Boolean (T_A Int Int))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A Boolean))