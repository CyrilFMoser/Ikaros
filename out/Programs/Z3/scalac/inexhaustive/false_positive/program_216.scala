package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B[E](a: Int, b: T_B[E, E]) extends T_B[E, T_A[E]]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_B T_A)