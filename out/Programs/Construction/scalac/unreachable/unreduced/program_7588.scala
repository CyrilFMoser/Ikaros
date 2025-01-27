package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[Int, T_B[T_A, T_A]], c: Byte) extends T_A
case class CC_B(a: (CC_A,(CC_A,(Byte,Boolean))), b: (CC_A,T_B[CC_A, T_A]), c: Boolean) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[(CC_A,CC_A), (CC_C,CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)