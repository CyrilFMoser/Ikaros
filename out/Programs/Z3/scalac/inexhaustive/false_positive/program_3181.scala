package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_A[T_B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char T_B))