package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[Byte, Boolean], Int]]
case class CC_B[D, E]() extends T_A[D, T_A[T_A[Byte, Boolean], Int]]
case class CC_C[F](a: Int, b: T_A[F, F]) extends T_A[F, T_A[T_A[Byte, Boolean], Int]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}