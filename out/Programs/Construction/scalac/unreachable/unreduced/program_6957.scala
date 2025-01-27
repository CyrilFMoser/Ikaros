package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E], b: T_A[T_A[E, E], E], c: CC_B[E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, CC_A(), CC_B(_, _))) => 3 
  case CC_B(_, CC_C(_, CC_B(_, _), CC_B(_, _))) => 4 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_B(_, _))) => 5 
  case CC_C(_, _, _) => 6 
}
}