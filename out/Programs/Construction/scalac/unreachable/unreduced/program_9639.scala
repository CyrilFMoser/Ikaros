package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_A[E, T_B[E, E]]) extends T_A[E, T_B[E, E]]
case class CC_B[F]() extends T_A[F, Byte]
case class CC_C[G](a: G) extends T_A[T_A[Int, T_A[Byte, Byte]], T_B[T_A[Int, T_A[Byte, Byte]], T_A[Int, T_A[Byte, Byte]]]]
case class CC_D[H]() extends T_B[H, Byte]
case class CC_E[I, J](a: I, b: I, c: I) extends T_B[I, J]

val v_a: T_A[T_A[Int, T_A[Byte, Byte]], T_B[T_A[Int, T_A[Byte, Byte]], T_A[Int, T_A[Byte, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, CC_E(_, _, _), CC_C(_))) => 0 
  case CC_A(_, _, CC_C(_)) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, CC_A(_, CC_E(_, _, _), CC_A(_, _, _)))