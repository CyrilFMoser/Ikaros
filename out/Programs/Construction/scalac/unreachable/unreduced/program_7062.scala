package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Int, c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: (Char,T_A[T_B, T_B]), b: Int, c: T_A[T_B, D]) extends T_A[T_B, D]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,CC_A(_, _, _)), _, _) => 1 
  case CC_B((_,CC_B(_, _, _)), _, _) => 2 
}
}