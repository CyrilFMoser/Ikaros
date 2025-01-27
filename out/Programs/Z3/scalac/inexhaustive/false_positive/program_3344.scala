package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int) extends T_A[C, D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)