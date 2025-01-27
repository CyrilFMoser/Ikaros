package Program_14 

object Test {
sealed trait T_B[A, B]
case class CC_C[F, E](a: E, b: T_B[E, Boolean]) extends T_B[F, E]
case class CC_D[G, H]() extends T_B[H, G]

val v_a: CC_C[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D()) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Wildcard Boolean Boolean (T_A Boolean))
//      Boolean
//      Boolean
//      (T_A Boolean))