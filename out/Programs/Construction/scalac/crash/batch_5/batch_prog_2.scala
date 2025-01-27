package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: T_B[D]) extends T_A[T_B[D], D]
case class CC_B[E]() extends T_A[T_B[E], E]
case class CC_C[F]() extends T_A[T_B[F], F]

val v_a: T_A[T_B[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}