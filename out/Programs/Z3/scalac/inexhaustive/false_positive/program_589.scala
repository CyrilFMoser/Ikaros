package Program_31 

object Test {
sealed trait T_B[B]
case class CC_D[F](a: F) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants