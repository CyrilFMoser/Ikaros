package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: T_A[F, E]) extends T_A[E, F]
case class CC_C() extends T_B

val v_a: CC_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_C Char (T_A Char))