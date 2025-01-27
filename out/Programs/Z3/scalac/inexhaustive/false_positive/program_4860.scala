package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Int, Int]]
case class CC_B(a: Char, b: T_A[CC_A]) extends T_A[T_B[CC_A, Int]]

val v_a: T_A[T_B[CC_A, Int]] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_A T_A)