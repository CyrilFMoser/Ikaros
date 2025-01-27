package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: E, b: T_A[T_A[E, E], E], c: CC_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}