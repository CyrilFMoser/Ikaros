package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A
case class CC_B(a: CC_A, b: ((T_B,T_A),CC_A), c: T_B) extends T_A
case class CC_C(a: Byte, b: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), ((_,_),CC_A(_, _, _)), _) => 1 
  case CC_C(_, _) => 2 
}
}