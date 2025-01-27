package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[T_B[F, F]]) extends T_B[T_A[F], F]
case class CC_D[G]() extends T_B[CC_A[(Byte,Int)], G]

val v_a: T_B[T_A[Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_C(CC_B()) => 1 
}
}