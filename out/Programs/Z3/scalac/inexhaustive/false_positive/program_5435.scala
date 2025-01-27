package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: Boolean, b: T_A[E, E]) extends T_A[E, F]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)