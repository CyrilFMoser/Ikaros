package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E](a: Byte) extends T_A[E, CC_A[E, E]]
case class CC_C() extends T_B

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))