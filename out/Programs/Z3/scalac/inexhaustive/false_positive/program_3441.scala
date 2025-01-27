package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char) extends T_A[D, C]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) (Tuple (CC_A T_A) Wildcard) Wildcard T_A)