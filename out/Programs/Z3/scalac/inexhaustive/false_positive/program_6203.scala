package Program_14 

object Test {
sealed trait T_B[B]
case class CC_C[E](a: T_B[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_D()) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean) Wildcard Wildcard (T_A Boolean))