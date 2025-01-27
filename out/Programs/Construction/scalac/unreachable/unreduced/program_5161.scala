package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Byte, Boolean],T_B[Byte]), b: T_A[D, T_B[D]], c: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]]) extends T_A[E, T_B[E]]
case class CC_C() extends T_A[T_B[T_A[Char, Byte]], T_B[T_B[T_A[Char, Byte]]]]
case class CC_D[F](a: T_A[F, F]) extends T_B[F]
case class CC_E[G](a: T_B[G], b: (T_B[CC_C],CC_A[CC_C]), c: CC_C) extends T_B[G]
case class CC_F(a: T_A[CC_C, CC_B[CC_C]], b: CC_A[(Int,CC_C)]) extends T_B[Byte]

val v_a: T_B[T_A[T_B[T_A[Char, Byte]], T_B[T_B[T_A[Char, Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, CC_C()) => 1 
}
}