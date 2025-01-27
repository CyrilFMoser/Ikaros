package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int, b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C(a: ((T_B,T_B),T_B), b: (T_A[T_B, T_B],CC_A[T_B])) extends T_A[T_A[CC_B[(T_B,T_B)], CC_B[(T_B,T_B)]], CC_B[(T_B,T_B)]]
case class CC_D(a: Int) extends T_B
case class CC_E[E](a: CC_B[Char], b: T_A[T_A[CC_C, CC_C], CC_C]) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[CC_B[(T_B,T_B)], CC_B[(T_B,T_B)]], CC_B[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)