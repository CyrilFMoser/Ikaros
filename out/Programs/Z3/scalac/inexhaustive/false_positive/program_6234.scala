package Program_15 

object Test {
sealed trait T_B[B]
case class CC_B[D](a: D) extends T_B[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_D Wildcard (CC_F Boolean T_B) T_B) T_B)