package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[G, H](a: G) extends T_B[G, H]

val v_a: CC_C[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C (CC_A (CC_B Boolean Boolean) Boolean (T_A (CC_B Boolean Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (T_A Int)))