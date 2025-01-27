package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: T_A[Char, C], c: T_A[C, C]) extends T_A[Char, C]
case class CC_B[D](a: D, b: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_B(_, CC_A(_, CC_B(_, _), _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
}
}
// This is not matched: CC_A(_, _, _)