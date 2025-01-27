package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, Boolean],T_B), b: T_B, c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C(a: T_A[CC_A[(Byte,Char)], CC_B[T_B]], b: Char, c: Char) extends T_A[T_A[Byte, T_A[Byte, Byte]], Byte]
case class CC_D(a: T_A[T_B, T_B], b: T_B, c: CC_C) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_C) extends T_B

val v_a: T_A[T_A[Char, T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_D(_, _, _)), CC_D(_, _, _), _) => 0 
  case CC_A((_,CC_E()), CC_D(_, _, _), _) => 1 
  case CC_A((_,CC_F(_)), CC_D(_, _, _), _) => 2 
  case CC_A((_,CC_D(_, _, _)), CC_E(), _) => 3 
  case CC_A((_,CC_E()), CC_E(), _) => 4 
  case CC_A((_,CC_F(_)), CC_E(), _) => 5 
  case CC_A((_,CC_D(_, _, _)), CC_F(CC_C(_, _, _)), _) => 6 
  case CC_A((_,CC_E()), CC_F(CC_C(_, _, _)), _) => 7 
  case CC_A((_,CC_F(_)), CC_F(CC_C(_, _, _)), _) => 8 
  case CC_B() => 9 
}
}