package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[T_A[C, C], C], c: Boolean) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: Char, c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(true, _, _), _) => 0 
  case CC_A(_, CC_A(false, _, _), _) => 1 
  case CC_A(_, CC_B(_, _, _), _) => 2 
  case CC_A(_, CC_C(_, _, _), _) => 3 
  case CC_B(_, _, _) => 4 
  case CC_C(_, _, CC_A(_, _, _)) => 5 
  case CC_C(_, _, CC_B(_, _, _)) => 6 
  case CC_C(_, _, CC_C(_, _, _)) => 7 
}
}