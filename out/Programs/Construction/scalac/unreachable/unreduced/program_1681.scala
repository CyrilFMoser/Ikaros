package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: CC_A[E], b: E, c: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: Boolean, b: CC_B[F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C(_, CC_B(_, _, _)) => 1 
  case CC_D() => 2 
}
}