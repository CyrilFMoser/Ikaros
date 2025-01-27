package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[(T_B[Char, Char],T_B[Byte, Byte]), E]
case class CC_B[F]() extends T_A[(T_B[Char, Char],T_B[Byte, Byte]), F]
case class CC_C[G](a: CC_A[G]) extends T_A[(T_B[Char, Char],T_B[Byte, Byte]), G]
case class CC_D[H, I]() extends T_B[H, I]
case class CC_E[J](a: T_B[J, J], b: J, c: J) extends T_B[CC_A[T_B[Char, Char]], J]

val v_a: T_A[(T_B[Char, Char],T_B[Byte, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_A(_))