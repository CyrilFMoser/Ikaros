package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[Byte, T_B], T_A[Byte, ((Boolean,Byte),T_B)]]
case class CC_B() extends T_A[T_A[Byte, T_B], T_A[Byte, ((Boolean,Byte),T_B)]]
case class CC_C(a: T_A[T_B, T_A[Byte, Char]], b: Char) extends T_B
case class CC_D(a: (T_A[CC_B, CC_C],T_A[Char, CC_B]), b: T_A[CC_C, T_B]) extends T_B
case class CC_E(a: CC_D, b: CC_C) extends T_B

val v_a: T_A[T_A[Byte, T_B], T_A[Byte, ((Boolean,Byte),T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D((_,_), _)) => 1 
  case CC_A(CC_E(_, _)) => 2 
  case CC_B() => 3 
}
}