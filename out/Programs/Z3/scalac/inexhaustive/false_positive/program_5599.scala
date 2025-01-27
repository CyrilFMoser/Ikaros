package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[G](a: Int) extends T_A[T_A[G, G], G]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)