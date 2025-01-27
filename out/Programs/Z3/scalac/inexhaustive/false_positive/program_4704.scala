package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char) extends T_A[C, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean (Tuple Boolean Int)))