package Program_15 

object Test {
sealed trait T_B[B]
case class CC_B[D](a: Byte) extends T_B[D]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A T_A)