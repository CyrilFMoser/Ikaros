package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)]) extends T_A[Byte]
case class CC_B(a: T_A[T_A[CC_A]], b: ((T_B,T_B),Boolean), c: Byte) extends T_B
case class CC_C(a: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, ((_,_),true), _) => 0 
  case CC_B(_, ((_,_),false), _) => 1 
  case CC_C(_) => 2 
}
}