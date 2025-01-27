package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_B, T_A[(Boolean,Char), T_B]], C]
case class CC_B[D]() extends T_A[T_A[T_B, T_A[(Boolean,Char), T_B]], D]
case class CC_C[E](a: CC_A[E], b: E, c: T_A[E, E]) extends T_A[T_A[T_B, T_A[(Boolean,Char), T_B]], E]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: Int) extends T_B

val v_a: T_A[T_A[T_B, T_A[(Boolean,Char), T_B]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), 'x', _) => 2 
}
}
// This is not matched: CC_C(CC_A(_, _), _, _)