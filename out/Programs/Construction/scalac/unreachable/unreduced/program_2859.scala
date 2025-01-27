package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[C, ((T_B,T_B),T_A[T_B, T_B])]
case class CC_B[D]() extends T_A[D, ((T_B,T_B),T_A[T_B, T_B])]
case class CC_C(a: T_A[CC_B[T_B], CC_B[T_B]], b: CC_B[T_A[Byte, (Char,Char)]]) extends T_B
case class CC_D(a: (T_B,(CC_C,Int))) extends T_B
case class CC_E(a: Char) extends T_B

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), CC_C(_, CC_B())) => 0 
  case CC_A(CC_C(_, _), CC_D(_)) => 1 
  case CC_A(CC_C(_, _), CC_E(_)) => 2 
  case CC_A(CC_D((_,_)), CC_C(_, CC_B())) => 3 
  case CC_A(CC_D((_,_)), CC_D(_)) => 4 
  case CC_A(CC_D((_,_)), CC_E(_)) => 5 
  case CC_A(CC_E(_), CC_C(_, CC_B())) => 6 
  case CC_A(CC_E(_), CC_D(_)) => 7 
  case CC_A(CC_E(_), CC_E(_)) => 8 
}
}