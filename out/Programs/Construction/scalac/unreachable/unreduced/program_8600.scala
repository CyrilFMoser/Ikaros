package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[Char]) extends T_A[C]
case class CC_B(a: T_A[T_A[Int]], b: Int) extends T_A[CC_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: CC_A[CC_B]) extends T_A[CC_A[T_A[Boolean]]]
case class CC_D(a: (CC_C,CC_B), b: CC_B, c: Int) extends T_B[CC_A[(CC_B,CC_B)]]
case class CC_E(a: Char) extends T_B[CC_A[(CC_B,CC_B)]]
case class CC_F(a: T_A[T_B[CC_B]]) extends T_B[CC_A[T_A[CC_D]]]

val v_a: T_A[CC_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _), _), CC_A(_, _))