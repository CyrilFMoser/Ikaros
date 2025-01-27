package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[T_B, T_B])) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[T_A[T_B, Int], T_A[T_B, Int]], T_A[T_B, Int]], b: CC_B[CC_A[T_B]]) extends T_A[T_A[CC_B[Char], CC_B[Char]], CC_B[Char]]
case class CC_D(a: T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: Byte, b: T_A[T_A[CC_B[CC_E], CC_B[CC_E]], CC_B[CC_E]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_))) => 0 
  case CC_D(CC_B()) => 1 
  case CC_E() => 2 
  case CC_F(_, _) => 3 
}
}