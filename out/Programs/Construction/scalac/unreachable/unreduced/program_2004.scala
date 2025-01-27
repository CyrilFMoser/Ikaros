package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: T_B[T_A[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C[C](a: C, b: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D](a: CC_B) extends T_B[D]
case class CC_E[E](a: T_B[E], b: CC_C[E]) extends T_B[E]
case class CC_F[F](a: ((Int,CC_A),CC_A), b: CC_E[F]) extends T_B[F]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}