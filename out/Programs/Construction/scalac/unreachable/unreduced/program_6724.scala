package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[(T_B,Char)]) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: (T_A[(Boolean,Char)],T_B), b: T_B) extends T_B
case class CC_C(a: Boolean) extends T_B
case class CC_D(a: T_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_B(_, _)), CC_B((_,_), CC_B(_, _))) => 0 
  case CC_B((_,CC_C(_)), CC_B((_,_), CC_B(_, _))) => 1 
  case CC_B((_,CC_D(_)), CC_B((_,_), CC_B(_, _))) => 2 
  case CC_B((_,CC_B(_, _)), CC_B((_,_), CC_C(_))) => 3 
  case CC_B((_,CC_C(_)), CC_B((_,_), CC_C(_))) => 4 
  case CC_B((_,CC_D(_)), CC_B((_,_), CC_C(_))) => 5 
  case CC_B((_,CC_B(_, _)), CC_B((_,_), CC_D(_))) => 6 
  case CC_B((_,CC_C(_)), CC_B((_,_), CC_D(_))) => 7 
  case CC_B((_,CC_D(_)), CC_B((_,_), CC_D(_))) => 8 
  case CC_B((_,CC_B(_, _)), CC_C(_)) => 9 
  case CC_B((_,CC_C(_)), CC_C(_)) => 10 
  case CC_B((_,CC_D(_)), CC_C(_)) => 11 
  case CC_B((_,CC_B(_, _)), CC_D(_)) => 12 
  case CC_B((_,CC_C(_)), CC_D(_)) => 13 
  case CC_B((_,CC_D(_)), CC_D(_)) => 14 
  case CC_C(_) => 15 
  case CC_D(_) => 16 
}
}