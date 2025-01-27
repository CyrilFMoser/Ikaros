package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_C(), _) => 2 
  case CC_A(CC_B(_, _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _), _) => 4 
  case CC_A(CC_B(_, _), CC_C(), _) => 5 
  case CC_A(CC_C(), CC_A(_, _, _), _) => 6 
  case CC_A(CC_C(), CC_B(_, _), _) => 7 
  case CC_A(CC_C(), CC_C(), _) => 8 
  case CC_B(_, _) => 9 
  case CC_C() => 10 
}
}