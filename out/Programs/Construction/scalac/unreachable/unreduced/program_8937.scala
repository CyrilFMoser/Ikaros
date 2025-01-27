package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: E, b: T_A[T_A[E, E], T_A[T_A[E, E], T_A[E, E]]]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_B[F], b: F, c: Byte) extends T_B[F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_B(_, CC_B(_, CC_A())) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}