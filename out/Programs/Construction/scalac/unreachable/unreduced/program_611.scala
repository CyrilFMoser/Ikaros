package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,T_A), b: CC_A) extends T_A
case class CC_C(a: T_B[(T_A,(Byte,Boolean)), CC_B]) extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}