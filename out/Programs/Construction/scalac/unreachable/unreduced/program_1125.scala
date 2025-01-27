package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B[E](a: T_B[E]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: CC_B[F], c: CC_A[F, F]) extends T_A[F]
case class CC_D(a: CC_C[T_A[Char]], b: T_A[CC_C[Char]], c: Byte) extends T_B[T_A[T_A[Byte]]]
case class CC_E(a: Boolean, b: Char) extends T_B[T_A[T_A[Byte]]]

val v_a: T_A[T_B[T_A[T_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_), _)