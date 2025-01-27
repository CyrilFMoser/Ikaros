package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[Byte, C]
case class CC_B(a: CC_A[T_A[T_B, Int]], b: T_A[T_B, CC_A[Char]]) extends T_A[Byte, Char]
case class CC_C(a: T_A[Byte, T_A[Byte, CC_B]], b: CC_B) extends T_B
case class CC_D(a: CC_A[T_A[(Boolean,Boolean), CC_C]], b: Boolean, c: (CC_B,T_B)) extends T_B
case class CC_E() extends T_B

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_B(_, _)), CC_C(_, CC_B(_, _))) => 0 
  case CC_A(CC_D(_, _, _), CC_C(_, CC_B(_, _))) => 1 
  case CC_A(CC_C(_, CC_B(_, _)), CC_D(_, _, _)) => 2 
  case CC_A(CC_D(_, _, _), CC_D(_, _, _)) => 3 
  case CC_A(CC_E(), CC_D(_, _, _)) => 4 
  case CC_A(CC_C(_, CC_B(_, _)), CC_E()) => 5 
  case CC_A(CC_D(_, _, _), CC_E()) => 6 
  case CC_A(CC_E(), CC_E()) => 7 
}
}
// This is not matched: CC_A(CC_E(), CC_C(_, CC_B(_, _)))