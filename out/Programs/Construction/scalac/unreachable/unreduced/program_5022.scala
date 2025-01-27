package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B], c: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C(a: (CC_A[T_B],CC_B[T_B]), b: T_A[T_A[Char, T_B], T_A[T_B, Int]], c: T_B) extends T_B
case class CC_D(a: Byte) extends T_B

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_B(), CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_C(_, _, _), CC_B(), CC_A(_, _, _))) => 2 
  case CC_A(_, CC_B(), CC_A(CC_C(_, _, _), CC_B(), CC_A(_, _, _))) => 3 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_D(_), CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, CC_B(), CC_A(CC_D(_), CC_A(_, _, _), CC_A(_, _, _))) => 5 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_D(_), CC_B(), CC_A(_, _, _))) => 6 
  case CC_A(_, CC_B(), CC_A(CC_D(_), CC_B(), CC_A(_, _, _))) => 7 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_B())) => 8 
  case CC_A(_, CC_B(), CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_B())) => 9 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_C(_, _, _), CC_B(), CC_B())) => 10 
  case CC_A(_, CC_B(), CC_A(CC_C(_, _, _), CC_B(), CC_B())) => 11 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_D(_), CC_A(_, _, _), CC_B())) => 12 
  case CC_A(_, CC_B(), CC_A(CC_D(_), CC_A(_, _, _), CC_B())) => 13 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_D(_), CC_B(), CC_B())) => 14 
  case CC_A(_, CC_B(), CC_A(CC_D(_), CC_B(), CC_B())) => 15 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 16 
  case CC_A(_, CC_B(), CC_B()) => 17 
}
}