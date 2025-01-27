package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean
//      Byte
//      (CC_A Boolean Byte Wildcard Wildcard (T_A Byte Boolean))
//      (T_A Boolean Byte))