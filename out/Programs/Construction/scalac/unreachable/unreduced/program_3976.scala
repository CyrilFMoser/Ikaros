package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Int,T_A), T_A], b: T_B[Byte, ((Char,Boolean),T_A)], c: Boolean) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B) extends T_B[CC_B, (CC_A,(CC_B,T_A))]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_B(CC_A(_, _, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}