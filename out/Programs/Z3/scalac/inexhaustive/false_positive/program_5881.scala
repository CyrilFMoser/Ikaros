package Program_13 

object Test {
sealed trait T_B[C]
case class CC_B[F](a: F) extends T_B[F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants