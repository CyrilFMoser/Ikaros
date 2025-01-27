package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, T_A[E, E]]) extends T_A[T_A[(Boolean,Char), T_A[(Boolean,Char), (Boolean,Char)]], E]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_) => 2 
}
}