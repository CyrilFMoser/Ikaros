package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_A[D, D], D], c: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: T_A[T_A[CC_A[E], CC_A[E]], CC_A[E]]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_B(_, CC_A(CC_A(_)), _) => 3 
  case CC_B(_, CC_A(CC_B(_, _, _)), _) => 4 
  case CC_B(_, CC_A(CC_C(_, _)), _) => 5 
  case CC_B(_, CC_B(_, CC_A(_), _), _) => 6 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 7 
  case CC_B(_, CC_B(_, CC_C(_, _), _), _) => 8 
  case CC_B(_, CC_C(true, _), _) => 9 
  case CC_B(_, CC_C(false, _), _) => 10 
  case CC_C(_, _) => 11 
}
}