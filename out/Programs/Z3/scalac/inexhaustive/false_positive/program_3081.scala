package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Int, Int]]

val v_a: T_A[Char, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A (T_A Int Boolean) Boolean (T_A (T_A Int Boolean) Boolean))