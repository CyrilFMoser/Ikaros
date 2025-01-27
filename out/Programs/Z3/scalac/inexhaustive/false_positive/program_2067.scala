package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[G](a: G) extends T_A[T_A[G, G], G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B (CC_A Wildcard Wildcard Char T_A) T_A) Char T_A)