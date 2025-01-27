package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[Char, Byte], E]
case class CC_B[F, G](a: T_A[G, G], b: Byte) extends T_B[F, G]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)