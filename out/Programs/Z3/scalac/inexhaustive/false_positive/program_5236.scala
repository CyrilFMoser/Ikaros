package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_D[I](a: Boolean, b: T_A[I, I]) extends T_B[I]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)