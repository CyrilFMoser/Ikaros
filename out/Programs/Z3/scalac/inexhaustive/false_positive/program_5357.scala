package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: C) extends T_A[C, T_A[C, C]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard T_B)