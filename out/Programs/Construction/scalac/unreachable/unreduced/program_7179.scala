package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_B, c: Byte) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[T_B, T_A[T_B, T_B]], b: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], c: CC_A[T_B]) extends T_A[(CC_B[T_B],CC_A[(Byte,Byte)]), T_A[(CC_B[T_B],CC_A[(Byte,Byte)]), (CC_B[T_B],CC_A[(Byte,Byte)])]]
case class CC_D() extends T_B

val v_a: T_A[(CC_B[T_B],CC_A[(Byte,Byte)]), T_A[(CC_B[T_B],CC_A[(Byte,Byte)]), (CC_B[T_B],CC_A[(Byte,Byte)])]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(true, _, _), CC_A(_, _, _), CC_A(_, _, CC_D())) => 1 
  case CC_C(CC_A(false, _, _), CC_A(_, _, _), CC_A(_, _, CC_D())) => 2 
  case CC_C(CC_B(_, _, _), CC_A(_, _, _), CC_A(_, _, CC_D())) => 3 
  case CC_C(CC_A(true, _, _), CC_B(_, CC_D(), _), CC_A(_, _, CC_D())) => 4 
  case CC_C(CC_A(false, _, _), CC_B(_, CC_D(), _), CC_A(_, _, CC_D())) => 5 
  case CC_C(CC_B(_, _, _), CC_B(_, CC_D(), _), CC_A(_, _, CC_D())) => 6 
}
}
// This is not matched: CC_A(_, _, _)