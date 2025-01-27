package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, T_B], b: CC_A[CC_A[D]]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[T_B, T_B], (Char,T_B)]) extends T_B

val v_a: T_A[T_A[T_B, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}