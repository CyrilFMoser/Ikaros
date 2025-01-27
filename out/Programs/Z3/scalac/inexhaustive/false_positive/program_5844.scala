package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[B, C]
case class CC_A() extends T_A
case class CC_C[E, D](a: Int) extends T_B[E, D]

val v_a: CC_C[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int Boolean) Byte))