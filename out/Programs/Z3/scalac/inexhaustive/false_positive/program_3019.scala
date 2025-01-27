package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_B() extends T_A
case class CC_D[C](a: Byte) extends T_B[C]

val v_a: CC_D[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int)))