package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_B[D]) extends T_A[T_B[T_A[Byte, Char]], D]
case class CC_B[E](a: T_A[E, E], b: T_A[E, E], c: E) extends T_A[T_B[T_A[Byte, Char]], E]
case class CC_C() extends T_B[Byte]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_B[T_A[Byte, Char]], T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_C()) => 1 
}
}
// This is not matched: CC_B(_, _, CC_D())