package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[Char, C]) extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_B()) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A (Tuple Int Int))))