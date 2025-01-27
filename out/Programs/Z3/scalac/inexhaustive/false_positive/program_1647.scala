package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: Char) extends T_A[E, Boolean]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (T_B Byte))