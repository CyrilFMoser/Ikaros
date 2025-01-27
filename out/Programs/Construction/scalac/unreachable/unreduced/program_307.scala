package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[(Int,Char)], T_A[Byte]]]
case class CC_B(a: T_B[(CC_A,CC_A), T_B[CC_A, Int]]) extends T_A[T_B[T_A[(Int,Char)], T_A[Byte]]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_A[T_B[T_A[(Int,Char)], T_A[Byte]]]
case class CC_D[D](a: CC_C, b: Byte, c: Int) extends T_B[D, T_A[(CC_C,Byte)]]
case class CC_E(a: CC_D[Char]) extends T_B[Boolean, T_A[(CC_C,Byte)]]
case class CC_F[E](a: T_B[E, CC_E], b: Byte, c: (CC_A,Boolean)) extends T_B[E, T_A[(CC_C,Byte)]]

val v_a: T_A[T_B[T_A[(Int,Char)], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)