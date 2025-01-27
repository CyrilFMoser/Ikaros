package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[T_B[Boolean], D]

val v_a: T_A[T_B[Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard Wildcard (T_B Boolean))