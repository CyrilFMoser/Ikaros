package Program_12 

object Test {
sealed trait T_B[A, B]
case class CC_B[C](a: Int) extends T_B[C, Byte]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants