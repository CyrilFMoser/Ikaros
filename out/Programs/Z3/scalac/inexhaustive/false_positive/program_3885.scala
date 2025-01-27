package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char) extends T_A[D, C]

val v_a: CC_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (T_B Int))