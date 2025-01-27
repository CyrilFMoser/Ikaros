package Program_14 

object Test {
sealed trait T_B[B]
case class CC_B[D](a: T_B[D]) extends T_B[D]
case class CC_C[E]() extends T_B[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_C Char Wildcard (T_A Char))