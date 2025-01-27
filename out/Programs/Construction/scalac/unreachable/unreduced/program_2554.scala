package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E]) extends T_A[T_B[E], E]
case class CC_C[F](a: T_B[F], b: T_A[F, F], c: (Byte,CC_A[(Int,Byte)])) extends T_A[T_B[F], F]
case class CC_D(a: T_B[T_B[Int]]) extends T_B[T_B[Int]]

val v_a: T_A[T_B[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_B(CC_A())) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_C(_, _, _)) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _)))