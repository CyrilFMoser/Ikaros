package Program_11 

object Test {
sealed trait T_B[C]
case class CC_E[I]() extends T_B[I]
case class CC_F[J](a: T_B[J]) extends T_B[J]

val v_a: CC_F[Char] = null
val v_b: Int = v_a match{
  case CC_F(CC_E()) => 0 
}
}
// This is not matched: (CC_C Byte Int Wildcard Wildcard (T_A Int Byte))