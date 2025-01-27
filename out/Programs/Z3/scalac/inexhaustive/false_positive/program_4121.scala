package Program_15 

object Test {
sealed trait T_B[C]
case class CC_F[J](a: Char) extends T_B[J]

val v_a: CC_F[Byte] = null
val v_b: Int = v_a match{
  case CC_F('x') => 0 
}
}
// This is not matched: (CC_A T_A)