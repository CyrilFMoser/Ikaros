package Program_13 

object Test {
sealed trait T_B[B, C]
case class CC_B[F, E](a: T_B[F, F]) extends T_B[E, F]
case class CC_C[G, H]() extends T_B[G, H]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_E (CC_C T_A) Wildcard Wildcard (T_B (CC_C T_A)))