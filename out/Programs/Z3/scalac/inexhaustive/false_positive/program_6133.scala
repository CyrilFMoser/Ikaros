package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: Byte) extends T_A[D, E]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (CC_A T_B T_B T_B T_B) Wildcard Wildcard (T_A (CC_A T_B T_B T_B T_B) T_B))