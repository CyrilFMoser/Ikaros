package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B]) extends T_A[T_A[T_B]]

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants