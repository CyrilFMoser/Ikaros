package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: Byte, c: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_C(a: (CC_B,Char)) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_D() extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F(a: T_A[Char, CC_C], b: (Int,CC_A)) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, CC_D()) => 0 
  case CC_A(CC_D(), _, CC_E(CC_B(_, _))) => 1 
  case CC_A(CC_D(), _, CC_F(_, (_,_))) => 2 
  case CC_A(CC_E(CC_B(_, _)), _, CC_D()) => 3 
  case CC_A(CC_E(CC_B(_, _)), _, CC_E(CC_B(_, _))) => 4 
  case CC_A(CC_E(CC_B(_, _)), _, CC_F(_, (_,_))) => 5 
  case CC_A(CC_F(_, (_,_)), _, CC_D()) => 6 
  case CC_A(CC_F(_, (_,_)), _, CC_E(CC_B(_, _))) => 7 
  case CC_A(CC_F(_, (_,_)), _, CC_F(_, (_,_))) => 8 
}
}