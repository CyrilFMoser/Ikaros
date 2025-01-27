package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[Char]], D]
case class CC_B(a: CC_A[CC_A[Int]], b: Boolean, c: T_A[CC_A[Int], Char]) extends T_B[CC_A[Char]]
case class CC_C[E](a: T_B[CC_A[Char]]) extends T_B[E]

val v_a: T_A[T_B[T_B[Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _, _))) => 0 
  case CC_A(CC_C(CC_C(_))) => 1 
}
}