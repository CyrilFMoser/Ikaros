package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[(Byte,Int), C], b: D) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
  case CC_B(_, CC_C()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(_, _)