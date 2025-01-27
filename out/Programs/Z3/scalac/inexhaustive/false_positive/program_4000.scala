package Program_14 

object Test {
sealed trait T_B[C]
case class CC_B[F](a: Char) extends T_B[F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)