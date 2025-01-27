package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: T_B[(Byte,Char)], c: T_B[T_B[Boolean]]) extends T_A[T_B[(Int,Char)]]
case class CC_B(a: Byte) extends T_A[T_B[(Int,Char)]]
case class CC_C[C]() extends T_A[C]
case class CC_D(a: T_A[CC_B], b: (CC_A,(CC_B,CC_B)), c: T_A[(CC_B,CC_A)]) extends T_B[CC_C[T_A[CC_A]]]

val v_a: T_A[T_B[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}