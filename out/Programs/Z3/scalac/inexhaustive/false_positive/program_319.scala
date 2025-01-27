package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: Int, b: T_A[E, E]) extends T_A[Int, E]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_D (CC_C Byte Wildcard Wildcard Wildcard (T_B Byte))
//      (T_B (CC_A T_A T_A T_A)))