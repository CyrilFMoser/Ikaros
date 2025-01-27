package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, E], b: Byte) extends T_A[Byte, E]
case class CC_B(a: T_B[T_A[Byte, Boolean], CC_A[Byte]], b: T_A[T_B[Boolean, Int], CC_A[Byte]]) extends T_A[Byte, Boolean]
case class CC_C[F](a: F, b: T_A[Byte, Boolean], c: (Byte,T_A[Byte, CC_B])) extends T_B[T_A[Byte, Boolean], F]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(CC_C(_, _, _), _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _), _)