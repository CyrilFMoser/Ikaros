package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_B, b: T_B, c: T_A[T_B, Char]) extends T_A[T_B, Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (Tuple (CC_A Wildcard T_A) (CC_A Wildcard T_A))
//      (CC_A Wildcard T_A)
//      T_A)