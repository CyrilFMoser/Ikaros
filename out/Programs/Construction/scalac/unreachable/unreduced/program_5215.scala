package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],T_B), b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D, E](a: CC_A[E], b: Int, c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: T_B, b: Char, c: T_A[T_B, T_A[(Int,Char), Boolean]]) extends T_B
case class CC_D(a: T_A[T_B, (T_B,CC_C)], b: CC_C) extends T_B

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_C(_, _, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_D(_, _)), _) => 1 
  case CC_A((CC_B(_, _, _),CC_D(_, _)), _) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: CC_A((CC_B(_, _, _),CC_C(_, _, _)), _)