package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: T_B[E, T_A[E]]) extends T_B[E, T_A[E]]
case class CC_C() extends T_B[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]]]]

val v_a: T_B[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))) => 0 
  case CC_B(_, _, CC_B(CC_A(_, _), CC_A(_, _), CC_C())) => 1 
  case CC_B(_, _, CC_C()) => 2 
}
}
// This is not matched: CC_C()