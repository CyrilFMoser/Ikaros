package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[(Int,Byte), Byte], E]
case class CC_B[F]() extends T_A[T_B[(Int,Byte), Byte], F]
case class CC_C[G, H](a: T_A[G, H], b: T_B[G, G], c: CC_B[G]) extends T_B[G, H]
case class CC_D[I, J](a: I) extends T_B[J, I]
case class CC_E[K]() extends T_B[K, T_B[Char, Byte]]

val v_a: T_B[Int, T_B[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _, _), CC_B()) => 0 
  case CC_C(_, CC_D(_), CC_B()) => 1 
  case CC_D(_) => 2 
  case CC_E() => 3 
}
}