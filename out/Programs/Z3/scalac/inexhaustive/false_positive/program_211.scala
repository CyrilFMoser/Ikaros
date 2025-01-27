package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_C(a: Char, b: T_B[Int]) extends T_B[CC_A[Boolean, Char]]

val v_a: T_B[CC_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A) T_A)