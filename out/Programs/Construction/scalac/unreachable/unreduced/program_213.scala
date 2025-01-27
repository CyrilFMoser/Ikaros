package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: C, c: T_A[T_A[C, Boolean], T_A[C, C]]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C[E](a: E, b: T_A[E, Boolean], c: CC_B[E]) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(CC_C(_, _, _), _, _) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, _) => 4 
}
}