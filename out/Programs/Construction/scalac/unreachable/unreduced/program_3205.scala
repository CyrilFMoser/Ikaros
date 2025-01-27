package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[(T_A[Boolean, Char],((Byte,Boolean),Boolean)), C]
case class CC_B() extends T_A[(T_A[Boolean, Char],((Byte,Boolean),Boolean)), T_A[Char, T_A[Boolean, (Byte,Char)]]]
case class CC_C[D](a: CC_B, b: D) extends T_A[(T_A[Boolean, Char],((Byte,Boolean),Boolean)), D]

val v_a: T_A[(T_A[Boolean, Char],((Byte,Boolean),Boolean)), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_C(CC_B(), 12) => 2 
  case CC_C(CC_B(), _) => 3 
}
}