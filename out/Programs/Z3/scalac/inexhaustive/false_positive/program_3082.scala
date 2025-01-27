package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[Char, Boolean], D]

val v_a: T_A[T_A[Char, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_A (T_A Int Boolean) Boolean (T_A (T_A Int Boolean) Boolean))