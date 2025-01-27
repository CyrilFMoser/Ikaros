package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[(T_B,CC_A)]) extends T_A[Byte]
case class CC_C(a: CC_A, b: Int, c: Int) extends T_A[Byte]
case class CC_D(a: (CC_C,T_A[CC_B])) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(CC_D(_)) => 1 
  case CC_E(CC_E(_)) => 2 
}
}