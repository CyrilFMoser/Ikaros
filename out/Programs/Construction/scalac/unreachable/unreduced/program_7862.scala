package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,Byte)], b: T_A[(T_B,T_B)], c: T_A[(T_B,(Char,Char))]) extends T_A[(T_B,Byte)]
case class CC_B(a: CC_A, b: T_B, c: Boolean) extends T_A[(T_B,Byte)]
case class CC_C(a: (CC_B,Byte)) extends T_A[(T_B,Byte)]
case class CC_D() extends T_B
case class CC_E(a: T_A[Char]) extends T_B

val v_a: T_A[(T_B,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_B(CC_A(_, _, _), _, _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(CC_C(_), _, _)