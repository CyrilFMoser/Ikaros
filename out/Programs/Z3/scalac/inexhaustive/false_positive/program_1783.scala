package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: E) extends T_A[E, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants