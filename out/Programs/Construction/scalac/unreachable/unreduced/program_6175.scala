package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Char], Char]]
case class CC_B[D](a: D, b: Int, c: CC_A[D]) extends T_A[D, T_A[T_A[Char, Char], Char]]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}