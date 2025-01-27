package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[(Byte,T_A[T_B])]
case class CC_B(a: T_A[T_B]) extends T_A[(Byte,T_A[T_B])]
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: Boolean, b: (CC_C,CC_B)) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[CC_A]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, _) => 2 
}
}