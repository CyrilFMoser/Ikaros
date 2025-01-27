package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]], b: T_B) extends T_A[CC_A[(T_B,T_B)], T_A[CC_A[(T_B,T_B)], CC_A[(T_B,T_B)]]]
case class CC_C[D](a: D, b: T_A[D, D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_D(a: ((Int,CC_B),CC_B), b: CC_A[Boolean]) extends T_B
case class CC_E(a: Int) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_D(_, CC_A(_, CC_C(_, _, _))) => 1 
}
}