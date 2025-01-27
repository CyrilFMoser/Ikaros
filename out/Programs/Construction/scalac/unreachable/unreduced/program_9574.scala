package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: Boolean, c: T_B) extends T_A[T_B]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: (CC_A,T_A[(Int,Byte)])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_))) => 1 
  case CC_B(CC_C((_,_))) => 2 
  case CC_C(_) => 3 
}
}