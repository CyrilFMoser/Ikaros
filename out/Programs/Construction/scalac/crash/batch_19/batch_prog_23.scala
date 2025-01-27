package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: D) extends T_A[D]
case class CC_B[E](a: Boolean, b: CC_A[E]) extends T_A[E]
case class CC_C[F](a: CC_A[F], b: F, c: F) extends T_A[F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_, _, _), 'x', _)) => 0 
  case CC_B(_, CC_A(CC_B(_, _), 'x', _)) => 1 
  case CC_B(_, CC_A(CC_C(_, _, _), 'x', _)) => 2 
  case CC_B(_, CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_B(_, CC_A(CC_B(_, _), _, _)) => 4 
  case CC_B(_, CC_A(CC_C(_, _, _), _, _)) => 5 
}
}