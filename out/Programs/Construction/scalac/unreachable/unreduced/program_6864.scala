package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[T_A[Boolean]], c: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, T_A[F]], b: T_A[F]) extends T_B[F, T_A[F]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 2 
  case CC_A(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 3 
}
}
// This is not matched: CC_A(_, CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), _)