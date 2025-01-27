package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[D, D], D]]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}