package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: D, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B(CC_A(_, _), _, _)) => 3 
  case CC_C(CC_B(CC_B(_, _, _), _, _)) => 4 
  case CC_C(CC_B(CC_C(_), _, _)) => 5 
  case CC_C(CC_C(_)) => 6 
}
}