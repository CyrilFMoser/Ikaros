package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: D, c: T_A[Int, D]) extends T_A[Int, D]
case class CC_C[E](a: E, b: E, c: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
  case CC_B(CC_C(_, 0, _), _, _) => 2 
  case CC_B(CC_C(_, _, _), _, _) => 3 
  case CC_C(_, _, _) => 4 
}
}
// This is not matched: CC_B(CC_A(_), _, _)