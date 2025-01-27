package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A
case class CC_C(a: T_A, b: Byte) extends T_A
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_E()