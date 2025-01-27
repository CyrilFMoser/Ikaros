package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: Int) extends T_A[T_A[T_A[T_B, T_B], T_A[T_A[T_B, T_B], T_A[T_B, T_B]]], D]
case class CC_C(a: T_A[(Boolean,T_B), T_B], b: T_B, c: T_A[CC_B[T_B], CC_A[Boolean]]) extends T_B
case class CC_D(a: Int, b: T_B) extends T_B
case class CC_E(a: CC_A[T_B], b: CC_A[CC_C]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _, _)) => 0 
  case CC_D(_, CC_D(12, CC_C(_, _, _))) => 1 
  case CC_D(_, CC_D(_, CC_C(_, _, _))) => 2 
  case CC_D(_, CC_D(12, CC_D(_, _))) => 3 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 4 
  case CC_D(_, CC_D(12, CC_E(_, _))) => 5 
  case CC_D(_, CC_D(_, CC_E(_, _))) => 6 
}
}
// This is not matched: CC_D(_, CC_E(CC_A(_, _, _), CC_A(_, _, _)))