package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_A[T_B[T_A[E, E]], T_A[E, E]], c: Char) extends T_A[T_B[D], D]
case class CC_B[F](a: T_A[(Boolean,Boolean), F], b: F, c: (T_B[Int],Int)) extends T_A[T_B[F], F]
case class CC_C[G](a: T_A[T_B[G], G], b: T_A[T_B[G], G], c: G) extends T_A[T_B[G], G]
case class CC_D[H]() extends T_B[H]
case class CC_E[I](a: (CC_B[Int],CC_D[Char]), b: T_A[T_B[I], I]) extends T_B[I]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, 'x'), _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _), _)