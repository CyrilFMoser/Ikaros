package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Boolean)]]
case class CC_B(a: Char) extends T_A[T_A[CC_A]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)