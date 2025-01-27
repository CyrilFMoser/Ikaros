package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[F, F], b: T_A[T_B[F, F], F], c: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[G, H](a: T_B[H, G], b: T_B[H, H], c: H) extends T_B[G, H]
case class CC_D[I, J](a: T_B[I, Boolean], b: T_B[J, Boolean], c: I) extends T_B[I, Boolean]

val v_a: T_A[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 2 
  case CC_B(_, CC_B(_, CC_A(), CC_A()), CC_A()) => 3 
  case CC_B(_, CC_B(_, CC_A(), CC_A()), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_B(_, CC_A(), CC_B(_, _, _)), CC_A()) => 5 
  case CC_B(_, CC_B(_, CC_A(), CC_B(_, _, _)), CC_B(_, _, _)) => 6 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_A()) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_B(_, _, _)) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A()) => 9 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 10 
}
}