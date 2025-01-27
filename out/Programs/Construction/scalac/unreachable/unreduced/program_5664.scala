package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, Byte], E]
case class CC_B() extends T_A[T_B[T_A[T_B[CC_A[Int], Byte], CC_A[Int]], Byte], T_A[T_B[CC_A[Int], Byte], CC_A[Int]]]
case class CC_C[F](a: T_A[F, CC_B], b: T_A[T_B[F, Byte], F]) extends T_A[T_B[F, Byte], F]
case class CC_D() extends T_B[T_A[T_B[CC_B, Byte], CC_B], CC_B]

val v_a: T_A[T_B[T_A[T_B[CC_A[Int], Byte], CC_A[Int]], Byte], T_A[T_B[CC_A[Int], Byte], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}