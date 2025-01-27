package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], D]
case class CC_C[E](a: T_A[E, E], b: CC_A[E]) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], E]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}
// This is not matched: CC_A(_)