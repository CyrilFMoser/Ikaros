package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[(Boolean,Boolean), T_B[Int, Boolean]], E]
case class CC_B[F](a: T_B[F, F], b: T_B[CC_A[F], F], c: T_A[T_A[F, F], F]) extends T_A[T_A[(Boolean,Boolean), T_B[Int, Boolean]], F]
case class CC_C[G, H](a: Char, b: Char) extends T_B[G, H]

val v_a: T_A[T_A[(Boolean,Boolean), T_B[Int, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(_, _), _) => 1 
}
}