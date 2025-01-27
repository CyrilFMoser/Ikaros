package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_E (T_A Boolean) Boolean)
//      Wildcard
//      (Tuple Wildcard Byte)
//      (CC_B (CC_E Boolean Boolean) (T_A (CC_E Boolean Boolean)))
//      (T_A (CC_E (T_A Boolean) Boolean)))