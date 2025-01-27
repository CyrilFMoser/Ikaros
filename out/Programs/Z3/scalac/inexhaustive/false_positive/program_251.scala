package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F](a: F) extends T_A[F, G]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_B (CC_B T_A T_A T_A)))