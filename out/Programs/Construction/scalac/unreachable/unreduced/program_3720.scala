package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B, c: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[(Boolean,Boolean)], CC_A[(Char,Boolean)]]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_C[D, E]() extends T_A[D, T_A[D, D]]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(), CC_D()) => 0 
  case CC_A(_, CC_E(), CC_D()) => 1 
  case CC_A(_, CC_D(), CC_E()) => 2 
  case CC_A(_, CC_E(), CC_E()) => 3 
  case CC_B(_) => 4 
  case CC_C() => 5 
}
}