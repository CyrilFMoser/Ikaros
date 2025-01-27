package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Int, c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[CC_A[D], CC_A[D]], CC_A[D]], b: T_A[D, D], c: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E], b: E, c: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(_, _, _), _, 0) => 1 
  case CC_C(CC_A(_, _, _), _, _) => 2 
  case CC_C(CC_B(CC_A(_, _, _), _, _), _, 0) => 3 
  case CC_C(CC_B(CC_A(_, _, _), _, _), _, _) => 4 
  case CC_C(CC_B(CC_B(_, _, _), _, _), _, 0) => 5 
  case CC_C(CC_B(CC_B(_, _, _), _, _), _, _) => 6 
  case CC_C(CC_B(CC_C(_, _, _), _, _), _, 0) => 7 
  case CC_C(CC_B(CC_C(_, _, _), _, _), _, _) => 8 
  case CC_C(CC_C(_, _, _), _, 0) => 9 
  case CC_C(CC_C(_, _, _), _, _) => 10 
}
}
// This is not matched: CC_A(_, _, _)