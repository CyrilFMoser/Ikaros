package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_B, c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], D]
case class CC_C(a: T_A[T_A[T_B, T_B], T_A[T_A[T_B, T_B], T_A[T_B, T_B]]], b: (T_A[T_B, T_B],Char), c: T_B) extends T_A[T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], CC_A[(T_B,T_B)]]
case class CC_D(a: T_A[(Char,CC_C), T_A[CC_C, CC_C]], b: T_A[Char, CC_B[T_B]], c: Boolean) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(true, CC_D(_, _, _), CC_C(_, _, _)) => 0 
  case CC_A(false, CC_D(_, _, _), CC_C(_, _, _)) => 1 
  case CC_A(true, CC_E(), CC_C(_, _, _)) => 2 
  case CC_A(false, CC_E(), CC_C(_, _, _)) => 3 
  case CC_A(true, CC_F(), CC_C(_, _, _)) => 4 
  case CC_A(false, CC_F(), CC_C(_, _, _)) => 5 
}
}