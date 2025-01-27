package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[F, E](a: CC_A[E, E], b: T_A[Byte, Boolean]) extends T_A[E, F]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)