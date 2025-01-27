package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[(Byte,Boolean)], b: T_A[T_B[CC_A]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: Byte, c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_D[C](a: C, b: Boolean) extends T_B[C]
case class CC_E[D](a: T_B[CC_A], b: CC_C, c: Int) extends T_B[D]
case class CC_F(a: T_B[T_A[Char]], b: CC_B) extends T_B[T_A[Char]]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, CC_C(_, _, CC_A()), _) => 1 
}
}