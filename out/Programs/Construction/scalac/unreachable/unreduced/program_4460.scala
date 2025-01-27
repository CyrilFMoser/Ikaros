package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[T_B, C]]) extends T_A[T_B, C]
case class CC_B[D](a: CC_A[D], b: Int, c: T_A[T_B, D]) extends T_B
case class CC_C(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_D[E](a: T_A[E, E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, 12, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_D(_) => 3 
}
}