package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_C[H, G](a: H, b: Char, c: T_B[H, G]) extends T_B[H, G]
case class CC_D[J, I]() extends T_B[J, I]

val v_a: CC_C[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_C (CC_E Wildcard Wildcard T_B) Wildcard T_B)