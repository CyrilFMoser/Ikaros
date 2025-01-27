package Program_14 

object Test {
sealed trait T_B[A]
case class CC_B[B](a: Char) extends T_B[B]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)