package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, T_A[C, Char]]) extends T_A[C, T_A[C, Char]]
case class CC_B[D](a: CC_A[D], b: D, c: T_A[(Boolean,Boolean), T_A[(Boolean,Boolean), Char]]) extends T_A[D, T_A[D, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}