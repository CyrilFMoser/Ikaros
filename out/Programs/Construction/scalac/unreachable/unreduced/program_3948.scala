package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: (T_A[Char],(T_B,Byte)), b: T_B) extends T_A[T_B]
case class CC_C(a: Boolean) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[T_B]], b: Int, c: CC_D) extends T_B
case class CC_F(a: T_B, b: (CC_A,CC_E), c: CC_E) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B((_,(_,_)), CC_D()) => 5 
  case CC_B((_,(_,_)), CC_E(_, _, CC_D())) => 6 
  case CC_B((_,(_,_)), CC_F(CC_D(), _, CC_E(_, _, _))) => 7 
  case CC_B((_,(_,_)), CC_F(CC_E(_, _, _), _, CC_E(_, _, _))) => 8 
  case CC_B((_,(_,_)), CC_F(CC_F(_, _, _), _, CC_E(_, _, _))) => 9 
  case CC_C(_) => 10 
}
}