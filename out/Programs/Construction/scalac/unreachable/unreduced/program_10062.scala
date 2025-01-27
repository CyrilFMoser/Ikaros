package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: Char, b: E, c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _), 0), _) => 2 
  case CC_B(CC_B(CC_A(_, _), _), _) => 3 
  case CC_B(CC_B(CC_B(_, _), 0), _) => 4 
  case CC_B(CC_B(CC_B(_, _), _), _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), 0), _) => 6 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 7 
  case CC_B(CC_C(_, _, _), _) => 8 
  case CC_C(_, _, _) => 9 
}
}