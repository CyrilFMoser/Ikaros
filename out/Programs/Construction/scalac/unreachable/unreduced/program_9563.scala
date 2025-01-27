package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, Byte]) extends T_A[C, Byte]
case class CC_B[D, E](a: T_A[T_A[E, CC_A[Boolean]], Byte], b: T_A[T_A[T_B, Byte], Byte]) extends T_A[D, Byte]
case class CC_C(a: T_A[T_A[T_B, Byte], CC_A[T_B]], b: T_A[T_B, CC_A[T_B]]) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[CC_C, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_C(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_C(_, _), CC_B(_, _))) => 1 
  case CC_A(_, CC_A(CC_D(), CC_A(_, _))) => 2 
  case CC_A(_, CC_A(CC_E(), CC_A(_, _))) => 3 
  case CC_A(_, CC_A(CC_E(), CC_B(_, _))) => 4 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 5 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 6 
  case CC_B(_, CC_A(_, _)) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 9 
}
}
// This is not matched: CC_A(_, CC_A(CC_D(), CC_B(_, _)))