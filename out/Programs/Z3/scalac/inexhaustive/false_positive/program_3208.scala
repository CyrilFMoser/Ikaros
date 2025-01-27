package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_D[K, J](a: T_A[K, J]) extends T_B[K, J]

val v_a: CC_D[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      (Tuple Char Wildcard)
//      (CC_A Boolean (T_A Boolean))
//      (T_B Boolean))