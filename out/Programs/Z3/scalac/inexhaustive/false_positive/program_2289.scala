package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[J, I](a: I) extends T_B[I, J]

val v_a: CC_C[Char, Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants