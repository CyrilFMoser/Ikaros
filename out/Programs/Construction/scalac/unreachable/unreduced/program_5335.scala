package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_B[D, D]], b: Char, c: D) extends T_A[D]
case class CC_B[E](a: Byte, b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[T_A[F], F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, 'x', _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, 'x', _), CC_B(_, _, _)) => 2 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_B(_, CC_A(_, _, _), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 5 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 6 
}
}