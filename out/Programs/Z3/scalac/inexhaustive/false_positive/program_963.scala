package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Int,Boolean), b: T_A[Boolean, E]) extends T_A[E, T_B[E, E]]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) Wildcard Wildcard T_A)