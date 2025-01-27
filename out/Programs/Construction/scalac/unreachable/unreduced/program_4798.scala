package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, (Char,Byte)], b: C) extends T_A[T_B, C]
case class CC_B(a: T_B, b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: T_A[CC_B, (CC_B,CC_B)], b: (T_A[(Byte,Boolean), Char],(CC_B,CC_B))) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, CC_D]) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_)), CC_C(_, (_,_))) => 0 
  case CC_A(CC_A(_, (_,_)), CC_D()) => 1 
  case CC_A(CC_A(_, (_,_)), CC_E(_)) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_B(CC_D(), _) => 4 
  case CC_B(CC_E(CC_A(_, _)), _) => 5 
}
}