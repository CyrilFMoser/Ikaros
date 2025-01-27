package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Char,Char), b: T_A[E, E]) extends T_A[E, T_B[Boolean, Byte]]

val v_a: T_A[Byte, T_B[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)