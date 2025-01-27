package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C], c: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: T_A[T_A[T_B, T_B], T_B], b: CC_A[T_A[T_B, T_B]], c: CC_A[(T_B,T_B)]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[Char, T_A[CC_B, T_B]], b: T_A[CC_C, CC_A[CC_C]], c: CC_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _)