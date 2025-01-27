package Program_13 

object Test {
sealed trait T_B[B]
case class CC_E[F](a: Char) extends T_B[F]

val v_a: CC_E[Boolean] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_B T_A)