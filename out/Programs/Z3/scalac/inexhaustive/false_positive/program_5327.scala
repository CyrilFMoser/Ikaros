package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_C(a: Char) extends T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)