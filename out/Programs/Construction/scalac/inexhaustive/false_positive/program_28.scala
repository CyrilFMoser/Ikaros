package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_A[T_A[E, E], E]) extends T_A[E, T_B[E, E]]
case class CC_C[G]() extends T_A[G, T_B[G, G]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: CC_A(CC_C(CC_A(_)))