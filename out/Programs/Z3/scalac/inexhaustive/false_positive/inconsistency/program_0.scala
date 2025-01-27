package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B
case class CC_C[E](a: Byte, b: T_A[E]) extends T_A[T_A[E]]

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_C(0, _) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)