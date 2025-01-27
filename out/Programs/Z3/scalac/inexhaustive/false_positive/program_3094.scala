package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_D[I, H](a: H) extends T_B[I, H]
case class CC_F() extends T_B[Byte, Byte]

val v_a: CC_D[CC_F, Byte] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Int T_A)