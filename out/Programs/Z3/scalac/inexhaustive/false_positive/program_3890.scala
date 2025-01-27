package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_C[J, I](a: Int) extends T_B[J, I]

val v_a: CC_C[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)