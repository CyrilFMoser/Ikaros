package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[T_A[Byte, Int], T_A[Char, Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard Wildcard (T_A Int))