package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,Byte)]) extends T_A[(T_B,Byte)]
case class CC_B(a: T_A[((Int,Boolean),Byte)], b: Char) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[Boolean], b: CC_B) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), CC_A(CC_B(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_B(_, _), CC_A(CC_C(), CC_A(_, _))) => 1 
  case CC_A(CC_B(_, _), CC_A(CC_D(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_C(), CC_A(CC_B(_, _), CC_A(_, _))) => 3 
  case CC_A(CC_C(), CC_A(CC_C(), CC_A(_, _))) => 4 
  case CC_A(CC_C(), CC_A(CC_D(_, _), CC_A(_, _))) => 5 
  case CC_A(CC_D(_, _), CC_A(CC_B(_, _), CC_A(_, _))) => 6 
  case CC_A(CC_D(_, _), CC_A(CC_C(), CC_A(_, _))) => 7 
  case CC_A(CC_D(_, _), CC_A(CC_D(_, _), CC_A(_, _))) => 8 
}
}