package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, C], C], b: T_A[Char, C]) extends T_A[Char, C]
case class CC_B[D](a: Byte, b: T_A[D, D], c: D) extends T_A[Char, D]
case class CC_C[E](a: E) extends T_A[Char, E]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_))) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _), _)) => 3 
  case CC_A(_, CC_B(_, CC_B(_, _, _), _)) => 4 
  case CC_A(_, CC_B(_, CC_C(_), _)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_C(_) => 7 
}
}
// This is not matched: CC_A(_, CC_C(_))