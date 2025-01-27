package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: Char, b: T_A[CC_B]) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)