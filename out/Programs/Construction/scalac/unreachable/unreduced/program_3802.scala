package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, ((Byte,Byte),T_A)], c: T_A) extends T_A
case class CC_B(a: T_B[(CC_A,T_A), Byte], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[(CC_A,(CC_C,CC_B)), T_B[T_B[CC_A, CC_B], CC_B]]
case class CC_E(a: CC_B) extends T_B[(CC_A,(CC_C,CC_B)), T_B[T_B[CC_A, CC_B], CC_B]]

val v_a: T_B[(CC_A,(CC_C,CC_B)), T_B[T_B[CC_A, CC_B], CC_B]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(_, _)) => 1 
}
}