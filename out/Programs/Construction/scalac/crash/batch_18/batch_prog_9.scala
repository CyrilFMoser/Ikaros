package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: Boolean, b: Byte) extends T_A
case class CC_B(a: (Char,T_A)) extends T_A
case class CC_C(a: CC_B, b: ((CC_B,T_A),CC_A), c: Int) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _))) => 0 
  case CC_B((_,CC_B(_))) => 1 
  case CC_B((_,CC_C(_, _, _))) => 2 
}
}