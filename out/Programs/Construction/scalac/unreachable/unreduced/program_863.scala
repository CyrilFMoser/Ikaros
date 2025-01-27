package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[(T_A[Char, Int],Boolean), C]
case class CC_B[E](a: Byte) extends T_A[(T_A[Char, Int],Boolean), E]
case class CC_C[F](a: T_A[F, CC_A[F, F]], b: F, c: CC_B[F]) extends T_A[(T_A[Char, Int],Boolean), F]

val v_a: T_A[(T_A[Char, Int],Boolean), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, CC_B(_)) => 2 
}
}