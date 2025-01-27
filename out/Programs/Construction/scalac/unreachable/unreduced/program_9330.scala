package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F, b: T_A[F]) extends T_B[F, Byte]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_B(_, _, _), _), _)