package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_C(a: T_A[Char, Char]) extends T_B[T_A[Byte, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B Wildcard (Tuple Wildcard Wildcard) (CC_A Wildcard Wildcard T_A) T_A)
//      T_A)