package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D) extends T_A[C, D]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C T_B)