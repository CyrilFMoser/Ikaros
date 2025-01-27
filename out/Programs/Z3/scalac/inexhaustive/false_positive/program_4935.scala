package Program_13 

object Test {
sealed trait T_B[B]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_B[E]) extends T_B[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))