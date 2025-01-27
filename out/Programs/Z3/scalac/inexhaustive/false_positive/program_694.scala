package Program_29 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Char) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)