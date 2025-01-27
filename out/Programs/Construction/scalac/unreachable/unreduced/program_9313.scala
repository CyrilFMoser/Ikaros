package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: T_A[C, T_A[C, C]], c: T_A[D, T_A[D, D]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: CC_A[CC_A[E, E], E], c: E) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: ((Boolean,Boolean),Boolean), b: F, c: CC_B[F]) extends T_A[F, T_A[F, T_A[F, F]]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_B(_, CC_A(_, _, _), _) => 2 
}
}
// This is not matched: CC_A(_, CC_B(_, _, _), _)