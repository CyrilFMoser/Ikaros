package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: Boolean) extends T_A[T_B]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[(CC_A,CC_A)], b: ((T_B,CC_B),CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_C(_, _)) => 2 
  case CC_C(_, ((_,_),CC_A(_, _))) => 3 
}
}