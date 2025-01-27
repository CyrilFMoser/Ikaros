package Program_15 

object Test {
sealed trait T_B
case class CC_D(a: Byte) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants