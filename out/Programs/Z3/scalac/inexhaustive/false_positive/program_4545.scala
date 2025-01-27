package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: E) extends T_A[E, F]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)