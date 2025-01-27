package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Char]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)