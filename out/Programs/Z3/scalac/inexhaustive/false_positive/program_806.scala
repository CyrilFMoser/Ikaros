package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: E) extends T_A[D, E]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Byte
//      Byte
//      Wildcard
//      Wildcard
//      (CC_B Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))
//      (T_A Byte Byte))