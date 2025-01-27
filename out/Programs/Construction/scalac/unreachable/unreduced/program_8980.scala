package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_A[T_B, T_B], D], b: D, c: CC_A[D]) extends T_A[T_B, D]
case class CC_C(a: CC_A[CC_B[(Boolean,Char)]], b: T_B, c: T_A[CC_A[Char], T_A[T_B, T_B]]) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, CC_A(_)) => 2 
}
}