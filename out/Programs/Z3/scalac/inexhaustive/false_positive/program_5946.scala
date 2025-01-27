package Program_13 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C) extends T_A
case class CC_B[E, D](a: T_A) extends T_B[D, E]
case class CC_C[G, F](a: T_B[F, F], b: Boolean) extends T_B[F, G]
case class CC_D[H](a: H) extends T_B[CC_B[H, H], H]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
}
}
// This is not matched: (CC_D T_A (CC_A T_A Wildcard T_A) (T_B (CC_B T_A T_A T_A T_A) T_A))
// This is not matched: (CC_A Wildcard T_A)