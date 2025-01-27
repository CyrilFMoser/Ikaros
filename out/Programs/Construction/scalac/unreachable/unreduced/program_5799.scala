package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Char, Boolean],T_A[Char, Int]), b: T_B[E, T_B[E, E]], c: T_A[E, T_B[E, E]]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_A[T_A[Byte, Int], (Int,Byte)], F]
case class CC_C(a: CC_A[T_B[Char, Byte]], b: CC_B[CC_A[Byte]], c: CC_A[T_A[Char, Boolean]]) extends T_B[T_A[T_B[Byte, Boolean], T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]]], Boolean]
case class CC_D() extends T_B[T_A[T_B[Byte, Boolean], T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]]], Boolean]
case class CC_E[G](a: CC_B[G], b: CC_A[G], c: T_A[G, G]) extends T_B[T_A[T_B[Byte, Boolean], T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]]], Boolean]

val v_a: T_B[T_A[T_B[Byte, Boolean], T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_E(_, _, _)