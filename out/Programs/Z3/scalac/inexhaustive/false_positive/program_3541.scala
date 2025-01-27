package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, H](a: H) extends T_A[G, H]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)