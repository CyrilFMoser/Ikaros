package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char) extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants