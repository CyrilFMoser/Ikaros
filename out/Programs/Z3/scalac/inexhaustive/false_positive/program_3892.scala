package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[Int, T_A[Boolean, Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)