package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: T_A[T_A[Char]]) extends T_A[C]
case class CC_B[E](a: T_B[E]) extends T_A[E]
case class CC_C[F](a: CC_B[F]) extends T_A[F]
case class CC_D(a: CC_A[T_A[Byte]], b: Byte, c: CC_B[T_B[Char]]) extends T_B[T_A[T_A[Int]]]
case class CC_E() extends T_B[T_A[T_A[Int]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)