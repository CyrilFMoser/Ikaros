package Program_15 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: F, c: F) extends T_A[F, E]
case class CC_B[G, H](a: CC_A[H, H]) extends T_A[G, T_A[G, G]]
case class CC_C[I]() extends T_A[I, T_A[I, I]]
case class CC_D[K, J](a: J, b: T_B[(Boolean,Boolean), J], c: T_B[Char, J]) extends T_B[K, J]
case class CC_E[L](a: T_A[L, L]) extends T_B[T_A[Char, Boolean], L]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_B Boolean
//      (T_A Boolean Boolean)
//      Wildcard
//      (T_A Boolean (T_A Boolean Boolean)))
// This is not matched: (CC_A (T_A (T_A Char)))