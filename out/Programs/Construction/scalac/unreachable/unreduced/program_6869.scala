package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[(T_A,T_A), (Byte,T_A)]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_B[(T_A,Byte), CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))