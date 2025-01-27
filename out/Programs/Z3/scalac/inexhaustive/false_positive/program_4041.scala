package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_A[D]

val v_a: CC_C[T_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A) (CC_C Wildcard Wildcard Char T_A))
//      Wildcard
//      T_A)