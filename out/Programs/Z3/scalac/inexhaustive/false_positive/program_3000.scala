package Program_13 

object Test {
sealed trait T_B[C]
case class CC_D[H]() extends T_B[H]
case class CC_F[J](a: T_B[J]) extends T_B[J]

val v_a: CC_F[Char] = null
val v_b: Int = v_a match{
  case CC_F(CC_D()) => 0 
}
}
// This is not matched: (CC_C Byte Int Wildcard Wildcard (T_A Int Byte))