package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[C, D]
case class CC_B[F, E, G](a: T_A[F, F], b: T_A[E, E]) extends T_A[F, E]
case class CC_C[H]() extends T_A[T_A[CC_A[Int, Boolean], T_A[Char, Int]], H]

val v_a: CC_B[Char, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(0)) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(_, CC_A(_))) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
}
}