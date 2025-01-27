package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D) extends T_A[D, C]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_E Wildcard Wildcard T_B)