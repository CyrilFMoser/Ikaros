package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: D, c: D) extends T_A[(T_A[Int, Char],Char), D]
case class CC_B[E](a: Byte, b: E, c: T_A[E, E]) extends T_A[(T_A[Int, Char],Char), E]
case class CC_C[F](a: F, b: T_B[F]) extends T_A[(T_A[Int, Char],Char), F]
case class CC_D[G](a: CC_C[G]) extends T_B[G]
case class CC_E[H](a: Byte, b: CC_B[H]) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, CC_D(_))) => 0 
  case CC_D(CC_C(_, CC_E(_, _))) => 1 
  case CC_E(_, CC_B(_, _, _)) => 2 
}
}