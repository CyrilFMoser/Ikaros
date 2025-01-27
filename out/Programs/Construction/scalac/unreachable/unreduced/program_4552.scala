package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[(Byte,Boolean), T_A[(Byte,Boolean), (Byte,Boolean)]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Char, b: D, c: T_A[T_A[D, D], D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}