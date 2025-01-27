package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[T_B[Char, Char]], b: Byte, c: CC_A[Byte]) extends T_B[(T_A[Char],CC_A[Boolean]), T_A[T_A[Byte]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_B(CC_B(_, _), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_B(CC_A(_, _, _), CC_A(CC_B(_, _), _, _)) => 2 
  case CC_B(CC_B(_, _), CC_A(CC_B(_, _), _, _)) => 3 
  case CC_B(CC_A(_, _, _), CC_B(_, CC_A(_, _, _))) => 4 
  case CC_B(CC_B(_, _), CC_B(_, CC_A(_, _, _))) => 5 
  case CC_B(CC_A(_, _, _), CC_B(_, CC_B(_, _))) => 6 
  case CC_B(CC_B(_, _), CC_B(_, CC_B(_, _))) => 7 
}
}
// This is not matched: CC_A(_, _, _)