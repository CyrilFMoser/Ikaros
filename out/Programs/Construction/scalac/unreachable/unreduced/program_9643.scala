package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (T_B,T_A[T_B, T_B])]
case class CC_B[D](a: T_A[D, D], b: D, c: CC_A[Byte]) extends T_A[D, (T_B,T_A[T_B, T_B])]
case class CC_C[E]() extends T_A[E, (T_B,T_A[T_B, T_B])]

val v_a: T_A[Int, (T_B,T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C() => 2 
}
}