package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: (Boolean,T_B), c: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_B, b: D, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C(a: CC_A[CC_B[T_B]]) extends T_B

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}