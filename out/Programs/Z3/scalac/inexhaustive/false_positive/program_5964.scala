package Program_15 

object Test {
sealed trait T_B[A, B]
case class CC_B[C](a: Char) extends T_B[C, Char]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A T_A)