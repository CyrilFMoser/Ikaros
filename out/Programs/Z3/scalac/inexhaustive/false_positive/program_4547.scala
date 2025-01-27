package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_C[G](a: G) extends T_A[Int, G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)