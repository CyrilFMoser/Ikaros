package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[D, C]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)