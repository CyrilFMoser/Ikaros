package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Char, C]]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, T_A[Char, D]]) extends T_A[T_A[T_A[T_B, T_B], T_A[Char, T_A[T_B, T_B]]], D]
case class CC_C[E](a: T_A[E, T_A[Char, E]]) extends T_A[E, T_A[Char, E]]
case class CC_D(a: Int, b: T_A[CC_C[Char], Boolean], c: (CC_A[T_B],CC_A[T_B])) extends T_B

val v_a: CC_C[T_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_C(CC_A(_))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}