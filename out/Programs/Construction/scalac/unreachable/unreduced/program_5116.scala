package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], Int], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[T_A[T_A[Char, Byte], Int], D]
case class CC_C[E](a: CC_B[E], b: E, c: E) extends T_A[T_A[T_A[Char, Byte], Int], E]

val v_a: T_A[T_A[T_A[Char, Byte], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_C(CC_B(_, _), _, _) => 2 
}
}