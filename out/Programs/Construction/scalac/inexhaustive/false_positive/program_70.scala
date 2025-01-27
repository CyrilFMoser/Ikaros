package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_D[G, F](a: T_B[G, G]) extends T_B[G, F]
case class CC_E[H, I]() extends T_B[I, H]

val v_a: CC_D[Char, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
}
}
// This is not matched: CC_A()