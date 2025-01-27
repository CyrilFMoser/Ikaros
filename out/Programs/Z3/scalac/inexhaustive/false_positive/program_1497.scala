package Program_31 

object Test {
sealed trait T_B[A]
case class CC_C[C](a: Char) extends T_B[C]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants