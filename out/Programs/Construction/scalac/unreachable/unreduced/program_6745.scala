package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], (Char,T_B)]
case class CC_B(a: CC_A, b: T_B) extends T_B
case class CC_C[C](a: (CC_A,T_A[CC_A, CC_A]), b: C) extends T_B
case class CC_D(a: (Byte,T_A[Boolean, CC_A])) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _), _), CC_B(_, _)) => 0 
  case CC_B(CC_A(CC_B(_, _), _), CC_C(_, _)) => 1 
  case CC_B(CC_A(CC_B(_, _), _), CC_D((_,_))) => 2 
  case CC_B(CC_A(CC_C(_, _), _), CC_B(_, _)) => 3 
  case CC_B(CC_A(CC_C(_, _), _), CC_C(_, _)) => 4 
  case CC_B(CC_A(CC_C(_, _), _), CC_D((_,_))) => 5 
  case CC_B(CC_A(CC_D(_), _), CC_B(_, _)) => 6 
  case CC_B(CC_A(CC_D(_), _), CC_C(_, _)) => 7 
}
}
// This is not matched: CC_B(CC_A(CC_D(_), _), CC_D((_,_)))