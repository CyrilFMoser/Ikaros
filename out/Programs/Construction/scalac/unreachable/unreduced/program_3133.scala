package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int) extends T_A[((T_B,T_B),T_B), (T_A[T_B, T_B],Byte)]
case class CC_B(a: Char, b: CC_A, c: T_B) extends T_A[((T_B,T_B),T_B), (T_A[T_B, T_B],Byte)]
case class CC_C() extends T_A[((T_B,T_B),T_B), (T_A[T_B, T_B],Byte)]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: Boolean) extends T_B
case class CC_F(a: T_A[CC_B, CC_A], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
  case CC_E(_) => 1 
  case CC_F(_, _) => 2 
}
}