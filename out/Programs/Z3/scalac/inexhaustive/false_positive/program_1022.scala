package Program_31 

object Test {
sealed trait T_B[B, C]
case class CC_B[E, D](a: D) extends T_B[D, E]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants