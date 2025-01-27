package Program_13 

object Test {
sealed trait T_B[C, D]
case class CC_D[K, J](a: T_B[J, K]) extends T_B[K, J]
case class CC_E[L, M]() extends T_B[L, M]

val v_a: CC_D[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: (CC_E T_B)