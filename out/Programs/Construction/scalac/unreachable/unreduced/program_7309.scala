package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[CC_A[D], T_A[CC_A[D], CC_A[D]]], b: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_A[Boolean]) extends T_A[CC_B[CC_A[Char]], T_A[CC_B[CC_A[Char]], CC_B[CC_A[Char]]]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _)))