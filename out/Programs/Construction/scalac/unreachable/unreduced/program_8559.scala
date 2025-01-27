package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[(T_B,T_B), T_B], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: T_B) extends T_A[T_A[(T_B,T_B), T_B], D]
case class CC_C(a: (T_A[T_B, T_B],CC_A[(Boolean,Boolean)]), b: T_A[T_A[T_B, T_B], CC_A[(Char,Int)]], c: CC_A[(T_B,T_B)]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_A[CC_B[CC_D]], b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((_,CC_A(_)), _, CC_A((_,_))) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D()