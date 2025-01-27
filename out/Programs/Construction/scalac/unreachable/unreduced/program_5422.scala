package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (Byte,T_A[T_B, T_B]), b: T_B) extends T_A[T_B, T_B]
case class CC_B[C](a: T_B, b: T_B, c: C) extends T_A[C, Char]
case class CC_C(a: T_B, b: T_A[CC_B[T_B], ((Int,Boolean),T_B)]) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_B[T_A[CC_A, Char]], b: CC_B[Int], c: Char) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
  case CC_A((_,CC_C(_, _)), _) => 1 
  case CC_C(CC_D(_), _) => 2 
  case CC_C(CC_E(), _) => 3 
  case CC_C(CC_F(_, _, _), _) => 4 
}
}