package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[E](a: Byte) extends T_A[T_A[E, E], E]
case class CC_C[F](a: F, b: CC_B[F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}