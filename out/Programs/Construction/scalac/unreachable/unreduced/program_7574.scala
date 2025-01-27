package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[T_A[Byte, Byte], Int]]
case class CC_B[D](a: D, b: Byte) extends T_A[D, T_A[T_A[Byte, Byte], Int]]
case class CC_C[E](a: T_A[E, E], b: E, c: T_A[E, E]) extends T_A[E, T_A[T_A[Byte, Byte], Int]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}