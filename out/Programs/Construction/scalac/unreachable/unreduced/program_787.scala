package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E]() extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}