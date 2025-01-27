package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[(T_B[Boolean],T_A[Boolean])]
case class CC_B(a: T_B[(Boolean,Int)]) extends T_A[(T_B[Boolean],T_A[Boolean])]
case class CC_C(a: Boolean) extends T_A[(T_B[Boolean],T_A[Boolean])]
case class CC_D(a: T_B[(CC_B,CC_C)], b: Boolean, c: Byte) extends T_B[(T_A[CC_B],(CC_C,CC_B))]
case class CC_E() extends T_B[(T_A[CC_B],(CC_C,CC_B))]

val v_a: T_B[(T_A[CC_B],(CC_C,CC_B))] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}