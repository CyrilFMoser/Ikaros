package Program_15 

object Test {
sealed trait T_B[B]
case class CC_D[F](a: F) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_A (T_B Char)
//      Wildcard
//      (CC_A (T_B Char) Wildcard Wildcard (T_A (T_B Char)))
//      (T_A (T_B Char)))