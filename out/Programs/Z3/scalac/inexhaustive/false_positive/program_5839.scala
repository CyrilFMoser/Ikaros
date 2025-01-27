package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B[D](a: D) extends T_B[D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants