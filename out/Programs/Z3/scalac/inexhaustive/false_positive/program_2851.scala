package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[C, Byte]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)