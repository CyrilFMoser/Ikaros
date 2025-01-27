package Program_15 

object Test {
sealed trait T_B[B]
case class CC_D(a: Char, b: T_B[Byte]) extends T_B[(Byte,Byte)]

val v_a: T_B[(Byte,Byte)] = null
val v_b: Int = v_a match{
  case CC_D('x', _) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (T_A (T_A Boolean Int) (CC_A Byte Char Boolean Boolean Boolean Boolean)))