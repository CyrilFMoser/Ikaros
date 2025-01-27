package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: ((Byte,Char),CC_A), b: T_A) extends T_B
case class CC_C(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(((_,_),CC_A()), _) => 0 
}
}