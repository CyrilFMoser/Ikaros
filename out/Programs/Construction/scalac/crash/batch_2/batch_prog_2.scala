package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: (T_A,T_A), b: ((Int,T_A),((Byte,Byte),Char)), c: (T_A,T_B[CC_A])) extends T_A
case class CC_C[B](a: CC_B, b: B, c: T_A) extends T_B[T_A]
case class CC_D(a: CC_A) extends T_B[T_A]
case class CC_E(a: CC_C[Byte], b: CC_D) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(CC_A(_, _), CC_C(_, _, _))) => 0 
  case CC_C(_, _, CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_A(CC_A(_, _), CC_D(_))) => 2 
  case CC_C(_, _, CC_A(CC_B(_, _, _), CC_D(_))) => 3 
  case CC_C(_, _, CC_A(CC_A(_, _), CC_E(_, _))) => 4 
  case CC_C(_, _, CC_A(CC_B(_, _, _), CC_E(_, _))) => 5 
  case CC_C(_, _, CC_B((_,_), (_,_), (_,_))) => 6 
  case CC_D(CC_A(CC_A(_, _), CC_C(_, _, _))) => 7 
  case CC_D(CC_A(CC_A(_, _), CC_D(_))) => 8 
  case CC_D(CC_A(CC_A(_, _), CC_E(_, _))) => 9 
  case CC_D(CC_A(CC_B(_, _, _), CC_C(_, _, _))) => 10 
  case CC_D(CC_A(CC_B(_, _, _), CC_D(_))) => 11 
  case CC_D(CC_A(CC_B(_, _, _), CC_E(_, _))) => 12 
  case CC_E(CC_C(CC_B(_, _, _), _, CC_A(_, _)), CC_D(_)) => 13 
  case CC_E(CC_C(CC_B(_, _, _), _, CC_B(_, _, _)), CC_D(_)) => 14 
}
}