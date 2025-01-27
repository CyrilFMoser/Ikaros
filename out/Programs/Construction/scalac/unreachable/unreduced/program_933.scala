package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C, c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_B[E], b: T_A[E, T_A[E, E]], c: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _, _)) => 3 
  case CC_C(_, CC_A(_, _, _), _) => 4 
  case CC_C(_, CC_B(_), _) => 5 
  case CC_C(_, CC_C(_, _, _), _) => 6 
}
}