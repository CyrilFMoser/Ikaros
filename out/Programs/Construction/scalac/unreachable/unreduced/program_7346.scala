package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]
case class CC_D(a: T_A[T_A[Char, T_B], T_A[T_A[Char, T_B], T_A[Char, T_B]]], b: CC_C[CC_A[Byte]], c: T_A[T_B, (T_B,T_B)]) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}