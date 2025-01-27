package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A (CC_B Wildcard Wildcard T_A) Char T_A) Wildcard T_A)