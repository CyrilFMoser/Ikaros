package Program_31 

object Test {
sealed trait T_B[C]
case class CC_B[E](a: E) extends T_B[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)