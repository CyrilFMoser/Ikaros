package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char, b: C, c: T_A[D, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], C]
case class CC_B[E](a: T_A[E, Byte]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], E]
case class CC_C[F](a: Char, b: CC_A[F, F], c: CC_A[F, F]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], F]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_, CC_A(_, _, _), CC_A('x', _, _)) => 3 
  case CC_C(_, CC_A(_, _, _), CC_A(_, _, _)) => 4 
}
}