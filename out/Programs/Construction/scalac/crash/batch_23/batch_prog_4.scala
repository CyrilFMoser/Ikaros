package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_A), b: Int, c: T_B) extends T_A
case class CC_B(a: (T_A,(CC_A,T_A)), b: (CC_A,T_B), c: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_B(_, _, _)), _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}