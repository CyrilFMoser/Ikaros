package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[D, T_A[T_A[Boolean, Byte], T_B[Boolean]]]
case class CC_B(a: CC_A[Int]) extends T_A[Int, T_A[T_A[Boolean, Byte], T_B[Boolean]]]
case class CC_C[E](a: Char, b: CC_A[E]) extends T_B[E]
case class CC_D[F](a: T_A[F, F], b: T_B[F]) extends T_B[F]
case class CC_E[G]() extends T_B[G]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A(CC_B(_), _)) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C(_, CC_A(CC_B(_), _))