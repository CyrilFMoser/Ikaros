package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[D, D]) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A (Tuple Char (CC_A Wildcard T_A)) T_A)