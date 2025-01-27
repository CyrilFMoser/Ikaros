package Program_15 

object Test {
sealed trait T_B[C]
case class CC_D[H](a: H) extends T_B[H]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants