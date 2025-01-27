package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: Char) extends T_A[T_B[Int]]
case class CC_B(a: Byte, b: Byte, c: CC_A) extends T_A[T_B[Int]]
case class CC_C[C](a: T_A[T_B[Int]], b: T_B[C]) extends T_A[C]
case class CC_D[D](a: Int) extends T_B[CC_C[CC_C[CC_A]]]
case class CC_E(a: (CC_A,CC_C[(Int,Boolean)]), b: Int) extends T_B[CC_C[CC_C[CC_A]]]
case class CC_F(a: CC_B, b: T_B[CC_E], c: CC_B) extends T_B[CC_C[CC_C[CC_A]]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, 0, CC_A(_, _)) => 1 
  case CC_B(_, _, CC_A(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}