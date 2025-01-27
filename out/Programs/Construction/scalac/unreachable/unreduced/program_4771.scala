package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[(Byte,(Char,Char))]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[CC_A]
case class CC_C(a: Boolean) extends T_A[CC_A]
case class CC_D[D, E, F]() extends T_B[E, D]
case class CC_E[G](a: G, b: (CC_C,CC_B), c: CC_B) extends T_B[T_A[CC_A], G]
case class CC_F(a: Int, b: CC_D[T_B[Char, (Int,Int)], Byte, Int], c: CC_D[T_A[CC_A], Byte, CC_D[(Byte,Boolean), CC_A, CC_C]]) extends T_B[T_A[CC_A], T_B[T_A[CC_A], T_B[CC_B, CC_B]]]

val v_a: T_B[T_A[CC_A], T_B[T_A[CC_A], T_B[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_E(_, (CC_C(_),CC_B(_)), _) => 0 
  case CC_F(_, _, CC_D()) => 1 
}
}
// This is not matched: CC_D()