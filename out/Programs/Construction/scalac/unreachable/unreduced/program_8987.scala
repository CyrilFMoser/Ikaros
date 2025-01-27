package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D, E](a: D, b: Boolean, c: D) extends T_A[D, T_B]
case class CC_C(a: T_A[CC_B[(Byte,Byte), T_B], T_A[Byte, (Byte,Byte)]]) extends T_A[CC_B[(T_B,T_B), T_B], T_B]

val v_a: T_A[CC_B[(T_B,T_B), T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}