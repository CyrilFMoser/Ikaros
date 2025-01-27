package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[H, I](a: H) extends T_B[H, I]

val v_a: CC_C[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))