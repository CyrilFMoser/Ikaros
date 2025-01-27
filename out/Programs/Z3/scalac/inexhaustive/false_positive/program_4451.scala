package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char) extends T_A[C, D]
case class CC_B() extends T_A[CC_A[Char, Boolean], Char]
case class CC_C() extends T_A[CC_A[Char, Boolean], Char]

val v_a: CC_A[CC_B, CC_C] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)