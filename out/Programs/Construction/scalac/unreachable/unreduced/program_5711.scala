package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, T_A[C, C]]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: Int, b: E, c: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(_, _, 0), _) => 2 
  case CC_A(CC_C(_, _, _), _) => 3 
  case CC_B() => 4 
  case CC_C(_, _, _) => 5 
}
}