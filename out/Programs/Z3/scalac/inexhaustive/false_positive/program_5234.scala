package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[G](a: T_A[G, G]) extends T_A[T_A[Int, G], G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)