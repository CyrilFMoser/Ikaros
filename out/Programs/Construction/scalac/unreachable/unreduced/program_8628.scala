package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], Int]]
case class CC_B[D](a: Char, b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Int, Char], Int]]
case class CC_C[E](a: (Byte,CC_A[Boolean])) extends T_A[E, T_A[T_A[Int, Char], Int]]

val v_a: T_A[Byte, T_A[T_A[Int, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)