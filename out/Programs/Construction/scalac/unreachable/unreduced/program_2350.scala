package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[(Int,Boolean), Char],CC_A[Byte])) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,CC_A(_, _))) => 1 
  case CC_C() => 2 
}
}