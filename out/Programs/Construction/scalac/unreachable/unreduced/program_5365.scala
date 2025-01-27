package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_A[T_B, CC_A], (T_B,Boolean)]) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]
case class CC_D() extends T_B
case class CC_E(a: Char) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, CC_B(_)), CC_A(_, _)) => 1 
  case CC_A(CC_A(_, CC_C()), CC_A(_, _)) => 2 
  case CC_A(CC_B(_), CC_A(_, _)) => 3 
  case CC_A(CC_C(), CC_A(_, _)) => 4 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_)) => 5 
  case CC_A(CC_A(_, CC_B(_)), CC_B(_)) => 6 
  case CC_A(CC_A(_, CC_C()), CC_B(_)) => 7 
  case CC_A(CC_B(_), CC_B(_)) => 8 
  case CC_A(CC_C(), CC_B(_)) => 9 
  case CC_A(CC_A(_, CC_A(_, _)), CC_C()) => 10 
  case CC_A(CC_A(_, CC_B(_)), CC_C()) => 11 
  case CC_A(CC_A(_, CC_C()), CC_C()) => 12 
  case CC_A(CC_B(_), CC_C()) => 13 
  case CC_A(CC_C(), CC_C()) => 14 
}
}