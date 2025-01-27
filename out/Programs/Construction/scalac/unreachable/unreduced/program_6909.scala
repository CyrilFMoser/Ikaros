package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: Byte) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: T_A[(T_B,T_B), T_B]) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), _, 0) => 0 
  case CC_A(CC_C(_), _, 0) => 1 
  case CC_A(CC_D(), _, 0) => 2 
  case CC_A(CC_B(_), _, _) => 3 
  case CC_A(CC_C(_), _, _) => 4 
  case CC_A(CC_D(), _, _) => 5 
}
}