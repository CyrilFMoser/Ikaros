package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Byte, C], C]
case class CC_B(a: Char) extends T_A[T_A[Byte, CC_A[Char]], CC_A[Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)