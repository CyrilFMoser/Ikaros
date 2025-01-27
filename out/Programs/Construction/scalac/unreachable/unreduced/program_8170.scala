package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: T_A[Int], b: T_B[CC_A]) extends T_A[T_A[(Boolean,Char)]]
case class CC_C(a: (Int,T_A[CC_B]), b: T_B[CC_A]) extends T_A[T_A[(Boolean,Char)]]
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: Byte) extends T_B[T_B[T_B[CC_B]]]
case class CC_F() extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_D()) => 2 
}
}