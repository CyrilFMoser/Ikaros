package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[F, E]
case class CC_B[H, I](a: T_B[H, I], b: I) extends T_A[H, I]
case class CC_C[J](a: Int, b: T_A[J, T_B[J, J]], c: Byte) extends T_B[J, Byte]
case class CC_D[K](a: Byte, b: T_A[K, K]) extends T_B[K, Byte]
case class CC_E(a: Byte) extends T_B[T_B[T_A[Int, Byte], Byte], Byte]

val v_a: T_B[T_B[T_B[T_A[Int, Byte], Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A()) => 1 
  case CC_D(_, CC_B(_, CC_D(_, _))) => 2 
  case CC_D(_, CC_B(_, CC_E(_))) => 3 
}
}
// This is not matched: CC_D(_, CC_B(_, CC_C(_, _, _)))