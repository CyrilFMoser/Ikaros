package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E](a: (Char,T_A[Char, Char]), b: Int) extends T_A[E, T_A[T_A[E, E], E]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)