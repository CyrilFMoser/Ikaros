package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[C, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)