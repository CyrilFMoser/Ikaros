package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_B[T_A[Byte], E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)