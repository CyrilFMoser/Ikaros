package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Char, T_A[Int, Byte]]]
case class CC_B[F](a: T_B[F, F], b: Boolean, c: F) extends T_B[T_A[F, F], F]
case class CC_C[G, H](a: T_B[T_A[G, G], G], b: Int) extends T_B[T_A[G, G], G]

val v_a: T_B[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _) => 0 
  case CC_C(CC_C(_, 12), _) => 1 
  case CC_C(CC_C(_, _), _) => 2 
}
}
// This is not matched: CC_B(_, _, _)