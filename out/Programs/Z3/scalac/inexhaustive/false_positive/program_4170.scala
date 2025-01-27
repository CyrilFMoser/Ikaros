package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_B[G](a: Char) extends T_B[G, Char]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard T_A) T_A)