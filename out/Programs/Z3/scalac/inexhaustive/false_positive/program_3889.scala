package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Char) extends T_A[E, F]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Char Wildcard Wildcard (T_A Char))