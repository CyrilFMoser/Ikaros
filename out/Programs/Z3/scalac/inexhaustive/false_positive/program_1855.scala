package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[(Char,Boolean), D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_D Wildcard T_B)