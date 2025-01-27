package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Char) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard T_B)