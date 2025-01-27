package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_C[D, E](a: Int) extends T_B[E, D]

val v_a: CC_C[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A (CC_C T_A) Wildcard Wildcard T_A)