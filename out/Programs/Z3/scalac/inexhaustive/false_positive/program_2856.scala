package Program_30 

object Test {
sealed trait T_B[B, C]
case class CC_B[F](a: Byte) extends T_B[F, Boolean]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants