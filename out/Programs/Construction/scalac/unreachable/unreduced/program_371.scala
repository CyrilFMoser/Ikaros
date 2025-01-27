package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: T_B, b: T_A[T_A[T_B, (Boolean,Byte)], T_A[CC_A, (Int,Char)]], c: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: T_B, b: ((CC_A,CC_A),Boolean), c: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[T_A[CC_A, CC_C], T_A[T_B, T_B]], b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, CC_C(_, _, _)) => 2 
}
}