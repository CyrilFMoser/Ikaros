package Program_11 

object Test {
sealed trait T_B[B]
case class CC_C[F](a: Byte) extends T_B[F]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants