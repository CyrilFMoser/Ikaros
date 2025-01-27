package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,T_B)]) extends T_A[(Boolean,T_A[Char])]
case class CC_B(a: T_B, b: Int) extends T_A[(Boolean,T_A[Char])]
case class CC_C(a: Byte) extends T_B
case class CC_D() extends T_B

val v_a: T_A[(Boolean,T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(0), _) => 0 
  case CC_A(CC_C(_), _) => 1 
  case CC_A(CC_D(), _) => 2 
  case CC_B(CC_C(_), _) => 3 
  case CC_B(CC_D(), _) => 4 
}
}