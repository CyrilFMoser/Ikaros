package Program_15 

object Test {
sealed trait T_B[C]
case class CC_C[E](a: Int) extends T_B[E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard (CC_A Int (T_A Int)) Wildcard (T_A Byte))