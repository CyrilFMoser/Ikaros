package Program_13 

object Test {
sealed trait T_B[C, D]
case class CC_C[G, H](a: Int) extends T_B[H, G]

val v_a: CC_C[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_F (T_B (T_A Int)))