package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[(Boolean,Char)]]) extends T_A
case class CC_D() extends T_B[T_B[T_B[CC_A]]]
case class CC_E() extends T_B[T_B[T_B[CC_A]]]
case class CC_F(a: T_B[(CC_A,CC_A)]) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()