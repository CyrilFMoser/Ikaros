package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], Char], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[T_A[T_A[Int, Byte], Char], D]
case class CC_C[E](a: E, b: CC_A[E], c: CC_B[E]) extends T_A[T_A[T_A[Int, Byte], Char], E]

val v_a: T_A[T_A[T_A[Int, Byte], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C(_, _, CC_B(_, _)) => 2 
}
}