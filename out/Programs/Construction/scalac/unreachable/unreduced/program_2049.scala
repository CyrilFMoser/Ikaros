package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[(T_B,T_A[Boolean])]
case class CC_B() extends T_A[(T_B,T_A[Boolean])]
case class CC_C(a: CC_B, b: CC_A, c: T_A[Byte]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[(T_B,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(), CC_A(_), _)) => 0 
  case CC_A(CC_D()) => 1 
  case CC_B() => 2 
}
}