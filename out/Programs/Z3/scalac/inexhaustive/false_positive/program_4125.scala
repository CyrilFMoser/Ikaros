package Program_11 

object Test {
sealed trait T_B[C]
case class CC_C[G](a: G) extends T_B[G]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A T_A)