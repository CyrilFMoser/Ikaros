package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[T_B[E, E]], b: T_A[E], c: E) extends T_A[E]
case class CC_C[F](a: Byte, b: F, c: F) extends T_B[T_A[Byte], F]
case class CC_D[G](a: T_B[T_A[Byte], T_A[G]]) extends T_B[G, T_B[T_A[Byte], CC_A[Byte]]]
case class CC_E[H]() extends T_B[T_A[Byte], Byte]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _), _)