package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_B, c: Char) extends T_A[C, T_B]
case class CC_B[D](a: Int, b: T_A[D, D], c: Byte) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: (T_B,T_B)) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(), _) => 0 
  case CC_A(_, CC_D(), _) => 1 
  case CC_A(_, CC_E((_,_)), _) => 2 
  case CC_B(_, _, _) => 3 
}
}