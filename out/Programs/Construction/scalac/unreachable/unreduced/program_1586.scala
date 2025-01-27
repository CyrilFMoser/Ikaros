package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[(T_B,Byte)]
case class CC_B(a: T_B, b: CC_A[CC_A[Boolean]], c: T_A[T_B]) extends T_A[(T_B,Byte)]
case class CC_C() extends T_A[(T_B,Byte)]
case class CC_D() extends T_B
case class CC_E(a: CC_A[T_B]) extends T_B

val v_a: T_A[(T_B,Byte)] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), CC_A(), _) => 0 
  case CC_B(CC_E(_), CC_A(), _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A()