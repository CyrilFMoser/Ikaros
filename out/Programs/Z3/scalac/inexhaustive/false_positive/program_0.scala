package Program_5 

 object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_B)]
case class CC_B(a: T_B, b: T_A[CC_A]) extends T_A[(T_B,T_B)]
case class CC_C(a: Byte) extends T_A[(T_B,T_B)]
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F(a: (CC_A,CC_A)) extends T_B

val v_a: T_A[(T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_B(CC_E(CC_E(_)), _) => 2 
  case CC_B(CC_F(_), _) => 3 
}
}