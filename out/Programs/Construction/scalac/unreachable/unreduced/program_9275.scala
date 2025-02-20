package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: Char) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E]() extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}