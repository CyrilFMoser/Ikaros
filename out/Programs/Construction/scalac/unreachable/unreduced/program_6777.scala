package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Boolean,Byte)], b: T_B) extends T_A[(Boolean,Byte)]
case class CC_B(a: CC_A, b: T_B) extends T_B
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D(a: (T_B,Boolean)) extends T_B

val v_a: T_A[(Boolean,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(CC_A(_, _), CC_B(_, _))) => 0 
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(CC_A(_, _), CC_C(_))) => 1 
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(CC_A(_, _), CC_D(_))) => 2 
  case CC_A(CC_A(_, CC_B(_, _)), CC_C(_)) => 3 
  case CC_A(CC_A(_, CC_B(_, _)), CC_D(_)) => 4 
  case CC_A(CC_A(_, CC_C(_)), CC_B(CC_A(_, _), CC_B(_, _))) => 5 
  case CC_A(CC_A(_, CC_C(_)), CC_B(CC_A(_, _), CC_C(_))) => 6 
  case CC_A(CC_A(_, CC_C(_)), CC_B(CC_A(_, _), CC_D(_))) => 7 
  case CC_A(CC_A(_, CC_C(_)), CC_C(_)) => 8 
  case CC_A(CC_A(_, CC_C(_)), CC_D(_)) => 9 
  case CC_A(CC_A(_, CC_D(_)), CC_B(CC_A(_, _), CC_B(_, _))) => 10 
  case CC_A(CC_A(_, CC_D(_)), CC_B(CC_A(_, _), CC_C(_))) => 11 
  case CC_A(CC_A(_, CC_D(_)), CC_B(CC_A(_, _), CC_D(_))) => 12 
  case CC_A(CC_A(_, CC_D(_)), CC_C(_)) => 13 
  case CC_A(CC_A(_, CC_D(_)), CC_D(_)) => 14 
}
}