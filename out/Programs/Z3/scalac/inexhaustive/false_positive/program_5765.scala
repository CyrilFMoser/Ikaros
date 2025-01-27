package Program_14 

object Test {
sealed trait T_A[A]
case class CC_C[B](a: Int) extends T_A[B]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)