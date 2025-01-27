package Program_30 

object Test {
sealed trait T_B[C, D]
case class CC_C[H, I](a: Byte) extends T_B[H, I]

val v_a: CC_C[Int, Int] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_B Char Int)))