package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Int]]
case class CC_E[D](a: Char, b: T_A[D]) extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_E('x', _) => 0 
}
}
// This is not matched: (CC_E Char (CC_D Char Wildcard Wildcard (T_B Char)) Char Wildcard (T_B Char))