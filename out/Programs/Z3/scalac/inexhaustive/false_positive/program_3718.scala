package Program_15 

object Test {
sealed trait T_B[A]
case class CC_B[B](a: Char) extends T_B[B]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants