package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: E) extends T_A[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)