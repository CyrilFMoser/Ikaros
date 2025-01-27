package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Byte, Int], T_B[Char, Int]]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C() extends T_B[CC_A, T_B[CC_A, CC_A]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_A Char Char Int Wildcard (T_A Char))