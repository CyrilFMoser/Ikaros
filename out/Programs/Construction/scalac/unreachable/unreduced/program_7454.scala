package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: CC_A, b: CC_A, c: T_B[Char]) extends T_A[T_A[T_B[Boolean]]]
case class CC_C[C, D](a: Boolean, b: T_A[D]) extends T_B[C]
case class CC_D[E](a: T_A[E], b: E, c: CC_A) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(_, _)