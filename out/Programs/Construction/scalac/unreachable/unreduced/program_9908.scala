package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean]]]
case class CC_B(a: (Boolean,T_B[CC_A, Byte])) extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean]]]
case class CC_C[D]() extends T_B[D, CC_B]
case class CC_D(a: CC_C[(CC_B,CC_B)], b: T_B[CC_B, T_B[CC_B, CC_B]]) extends T_B[(T_B[CC_B, CC_B],(CC_A,(Byte,Byte))), CC_B]

val v_a: T_B[(T_B[CC_B, CC_B],(CC_A,(Byte,Byte))), CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), _) => 1 
}
}