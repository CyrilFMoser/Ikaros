package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A[(T_B,T_B)]
case class CC_B(a: T_A[Byte], b: Int) extends T_A[(T_B,T_B)]
case class CC_C(a: T_A[(T_B,T_B)], b: CC_B, c: CC_A) extends T_A[(T_B,T_B)]
case class CC_D(a: T_A[(CC_A,CC_C)], b: T_A[(CC_B,(Byte,Char))], c: T_B) extends T_B
case class CC_E(a: CC_D) extends T_B
case class CC_F(a: CC_A, b: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_D(_, _, _)) => 1 
  case CC_F(_, _) => 2 
}
}