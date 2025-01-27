package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: Boolean) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Boolean, b: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[T_A[E, E], T_A[E, E]], T_A[E, E]], b: Int) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _), _)