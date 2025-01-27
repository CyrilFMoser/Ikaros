package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]], T_A[T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]], T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]]]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 2 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 3 
}
}