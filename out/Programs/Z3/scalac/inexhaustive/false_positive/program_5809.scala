package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F]() extends T_A[T_A[Int, Boolean], F]
case class CC_D[J, I](a: Byte, b: T_A[I, I]) extends T_B[J, I]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D(0, _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)