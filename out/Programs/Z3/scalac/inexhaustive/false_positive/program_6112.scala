package Program_15 

object Test {
sealed trait T_B[B]
case class CC_F(a: Int) extends T_B[Boolean]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(12) => 0 
}
}
// This is not matched: (CC_D Wildcard T_B)