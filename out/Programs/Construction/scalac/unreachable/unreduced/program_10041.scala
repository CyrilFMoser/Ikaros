package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B, T_A[T_B, (Boolean,Char)]], T_B]
case class CC_B(a: CC_A, b: Int) extends T_A[T_A[T_B, T_A[T_B, (Boolean,Char)]], T_B]
case class CC_C(a: T_A[CC_A, T_B], b: CC_A) extends T_A[T_A[T_B, T_A[T_B, (Boolean,Char)]], T_B]
case class CC_D(a: (T_A[CC_C, CC_A],T_B), b: CC_C, c: T_B) extends T_B
case class CC_E(a: Byte, b: T_A[T_B, Byte]) extends T_B
case class CC_F(a: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_D(_, _, _)), _, _) => 0 
  case CC_D((_,CC_E(_, _)), _, _) => 1 
  case CC_D((_,CC_F(_)), _, _) => 2 
  case CC_E(_, _) => 3 
  case CC_F(_) => 4 
}
}